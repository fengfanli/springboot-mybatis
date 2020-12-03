package com.feng.service.impl;

import com.feng.bean.Student;
import com.feng.dao.StudentMapper;
import com.feng.service.StudentService;
import com.feng.utils.PageUtil;
import com.feng.vo.req.StudentPageReqVo;
import com.feng.vo.resp.PageRespVo;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public Student getStuById(Integer userId) {
        return studentMapper.selectByPrimaryKey(userId);
    }


    @Override
    public PageRespVo<Student> getStuPageInfo(StudentPageReqVo studentPageReqVo) {
        PageHelper.startPage(studentPageReqVo.getPageNum(), studentPageReqVo.getPageSize());
        List<Student> students = studentMapper.getAllStudent();
        return PageUtil.getPageVO(students);
    }

    @Override
    public List<Student> getAllStu() {
        return studentMapper.getAllStudent();
    }
}
