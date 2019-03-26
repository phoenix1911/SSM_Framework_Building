package com.jialong.core.service;

import com.jialong.core.bean.Student;
import com.jialong.core.bean.Teacher;
import com.jialong.core.bean.UserRole;
import com.jialong.core.bean.UserRoleExample;
import com.jialong.core.mapper.StudentMapper;
import com.jialong.core.mapper.TeacherMapper;
import com.jialong.core.mapper.UserRoleMapper;
import com.jialong.security.bean.Users;
import com.jialong.security.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Tjl on 2019/3/21 9:27.
 */
@Service
public class TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    public List<Teacher> selectAll() {
        return teacherMapper.selectAll();
    }

    public Teacher queryById(int id) {
        return teacherMapper.selectByPrimaryKey(id);
    }

    public int update(Teacher teacher) {
        return teacherMapper.updateByPrimaryKey(teacher);
    }

    /**
     * 删除操作 删除teacher users userrole三张表的数据
     * @param id
     * @return
     */
    public int deleteById(int id) {
        usersMapper.deleteByPrimaryKey(String.valueOf(id));
        teacherMapper.deleteByPrimaryKey(id);

        UserRoleExample example = new UserRoleExample();
        UserRoleExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(String.valueOf(id));
        userRoleMapper.deleteByExample(example);

        return 0;
    }

    /**
     * 获取的教师是前台传来的 设置默认没有选题 密码为身份证后六位需要加密
     * 更新users , teacher, users_role表
     *
     * @param teacher 有教师编号 姓名 手机 地址 身份证
     * @return
     */
    public int insert(Teacher teacher) {

        //插入教师表
        teacherMapper.insert(teacher);

        //插入users表
        Users users = new Users();
        users.setUsername(String.valueOf(teacher.getTid()));
        users.setEnabled(true);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        //截取身份证后六位
        String password = String.valueOf(teacher.getSfz()).substring(String.valueOf(teacher.getSfz()).length() - 6);
        String hashedPassword = passwordEncoder.encode(password);
        //加密
        users.setPassword(hashedPassword);
        usersMapper.insert(users);

        //插入UserRole表 教师类型为3
        userRoleMapper.insert(new UserRole(String.valueOf(teacher.getTid()),4));

        return 0;
    }


}
