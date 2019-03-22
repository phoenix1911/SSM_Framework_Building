package com.jialong.core.service;

import com.jialong.core.bean.Student;
import com.jialong.core.bean.Teacher;
import com.jialong.core.mapper.StudentMapper;
import com.jialong.core.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Tjl on 2019/3/21 9:27.
 */
@Service
public class TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    public List<Teacher> selectAll() {
        return teacherMapper.selectAll();
    }


}
