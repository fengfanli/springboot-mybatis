package com.feng.service;

import com.feng.bean.Student;
import com.feng.dao.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentService {

    @Resource
    private StudentMapper studentMapper;

    public Student getStuById(Integer userId) {
        return studentMapper.selectByPrimaryKey(userId);
    }
}
