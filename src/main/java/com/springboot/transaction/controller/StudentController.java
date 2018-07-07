package com.springboot.transaction.controller;

import com.springboot.transaction.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/******************************
 * @author : liuyang
 * <p>ProjectName:01-springboot-mybatis  </p>
 * @ClassName :  StudentController
 * @date : 2018/7/8 0008
 * @time : 5:13
 * @createTime 2018-07-08 5:13
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@RestController
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("/student/selectAllStudent")
    public Object selectAllStudent() {
        return studentService.selectAllStudent();
    }

    @PutMapping("/student/updateStudent")
    public Object updateStudent() {
        return studentService.updateStudent();
    }
}
