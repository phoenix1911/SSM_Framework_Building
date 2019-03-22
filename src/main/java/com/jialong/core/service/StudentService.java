package com.jialong.core.service;

import com.jialong.core.bean.Student;
import com.jialong.core.bean.StudentExample;
import com.jialong.core.mapper.StudentMapper;
import com.jialong.testssm.bean.City;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Tjl on 2019/3/21 9:27.
 */
@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }

    public Student queryById(int id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    public int updateCity(Student city) {
        return studentMapper.updateByPrimaryKey(city);
    }
    public int deleteCityById(int id) {
        return studentMapper.deleteByPrimaryKey(id);
    }










    //测试
//    public static void main(String[] args) {
//        InputStream inputStream = null;
//        try {
//            inputStream = Resources.getResourceAsStream("testDAO.xml");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
//        Student student = new Student();
//        student.setXntid(1111);
//        StudentExample studentExample = new StudentExample();
//        StudentExample.Criteria criteria= studentExample.createCriteria();
//        criteria.andXntidEqualTo(1111);
//        List<Student> students = studentMapper.selectByExample(studentExample);
//        System.out.println(student);
//        sqlSession.commit();
//    }
}
