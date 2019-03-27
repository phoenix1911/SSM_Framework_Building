package com.jialong.core.service;

import com.jialong.core.bean.Student;
import com.jialong.core.bean.StudentExample;
import com.jialong.core.bean.UserRole;
import com.jialong.core.bean.UserRoleExample;
import com.jialong.core.mapper.StudentMapper;
import com.jialong.core.mapper.UserRoleMapper;
import com.jialong.security.bean.Users;
import com.jialong.security.mapper.UsersMapper;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Tjl on 2019/3/21 9:27.
 */
@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }

    public Student queryById(int id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    public int update(Student student) {
        return studentMapper.updateByPrimaryKey(student);
    }

    /**
     * 删除操作 删除student users userrole三张表的数据
     * @param id
     * @return
     */
    public int deleteById(int id) {
        usersMapper.deleteByPrimaryKey(String.valueOf(id));
        studentMapper.deleteByPrimaryKey(id);

        UserRoleExample example = new UserRoleExample();
        UserRoleExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(String.valueOf(id));
        userRoleMapper.deleteByExample(example);

        return 0;
    }

    /**
     * 获取的学生是前台传来的 设置默认没有选题 密码为身份证后六位需要加密
     * 更新users , student, users_role表
     *
     * @param student 有学号 姓名 手机 email 身份证
     * @return
     */
    public int insert(Student student) {

        //插入学生表
        student.setTopicstatus(0);
        studentMapper.insert(student);

        //插入users表
        Users users = new Users();
        users.setUsername(String.valueOf(student.getId()));
        users.setEnabled(true);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        //截取身份证后六位
        String password = String.valueOf(student.getSfz()).substring(String.valueOf(student.getSfz()).length() - 6);
        String hashedPassword = passwordEncoder.encode(password);
        //加密
        users.setPassword(hashedPassword);
        usersMapper.insert(users);

        //插入UserRole表 学生类型为3
        userRoleMapper.insert(new UserRole(String.valueOf(student.getId()),3));

        return 0;
    }

    /**
     * 下载学生信息模板
     * @param realPath
     * @return
     * @throws IOException
     */
    public ResponseEntity<byte[]> getResponseEntity(String realPath) throws IOException {
        File file = new File(realPath+"/template/StudentTemplate.xlsx");//新建一个文件

        HttpHeaders headers = new HttpHeaders();//http头信息

        String downloadFileName = new String("学生信息模板.xlsx".getBytes("UTF-8"),"iso-8859-1");//设置编码

        headers.setContentDispositionFormData("attachment", downloadFileName);

        //MediaType:互联网媒介类型  contentType：具体请求中的媒体类型信息
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);

        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.CREATED);
    }



}
