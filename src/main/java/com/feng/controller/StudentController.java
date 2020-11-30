package com.feng.controller;

import com.feng.bean.Student;
import com.feng.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/stu/{userId}")
    public Student getStuByIdPath(@PathVariable Integer userId){
        Student student = studentService.getStuById(userId);
        return student;
    }
}
