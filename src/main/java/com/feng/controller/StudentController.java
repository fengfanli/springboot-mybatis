package com.feng.controller;

import com.feng.bean.Student;
import com.feng.service.StudentService;
import com.feng.utils.DataResult;
import com.feng.vo.req.StudentPageReqVo;
import com.feng.vo.resp.PageRespVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/stu/{userId}")
    public DataResult<Student> getStuByIdPath(@PathVariable Integer userId){
        Student student = studentService.getStuById(userId);
        DataResult result = DataResult.success(student);
        return result;
    }

    @GetMapping(value = "/stu")
    @ResponseBody
    public DataResult<Student> getCompanyByIdGET(@RequestParam(value = "userId") Integer id) {
        Student student = studentService.getStuById(id);
        DataResult result = DataResult.success(student);
        return result;
    }

    @PostMapping(value = "/stuPageInfo")
    @ResponseBody
    public DataResult<PageRespVo<Student>> getStuPageInfo(@RequestBody StudentPageReqVo studentPageReqVo){
        PageRespVo<Student> stuPageInfo = studentService.getStuPageInfo(studentPageReqVo);
        DataResult result = DataResult.success(stuPageInfo);
        return result;
    }

    @GetMapping(value = "/allStu")
    @ResponseBody
    public DataResult<List<Student>> getAllStu(){
        List<Student> students = studentService.getAllStu();
        DataResult result = DataResult.success(students);
        return result;
    }
}
