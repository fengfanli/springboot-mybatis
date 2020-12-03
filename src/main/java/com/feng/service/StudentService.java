package com.feng.service;

import com.feng.bean.Student;
import com.feng.vo.req.StudentPageReqVo;
import com.feng.vo.resp.PageRespVo;

import java.util.List;


public interface StudentService {

    Student getStuById(Integer userId);

    PageRespVo<Student> getStuPageInfo(StudentPageReqVo studentPageReqVo);

    List<Student> getAllStu();
}
