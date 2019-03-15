package com.jialong.testMapper.service;

import com.jialong.testMapper.bean.Student;
import com.jialong.testMapper.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Tjl on 2019/3/15 13:48.
 */
@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public List<Student> selectAll() {
        return studentMapper.selectAll();

    }

}
