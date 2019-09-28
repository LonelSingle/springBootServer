package com.szh.controller;

import com.szh.model.MyResult;
import com.szh.model.Student;
import com.szh.model.User;
import com.szh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
@ResponseBody
@CrossOrigin  //解决跨域请求问题
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/login")
    public MyResult login(@RequestBody User user) {
        // 对 html 标签进行转义，防止 XSS 攻击
        String username = user.getUsername();
        username = HtmlUtils.htmlEscape(username);
        Student student = new Student();
        student.setStuname(username);
        student.setStutel(user.getPassword());
        List<Student> studentList = new ArrayList<>();
        studentList = studentService.login(student);
        MyResult myResult = new MyResult();

        if (studentList.size() != 0) {
            myResult.setCode(0);
            myResult.setMsg("success");
            myResult.setList(studentList);
            myResult.setObject(studentList.get(0));
            System.out.println(myResult.getMsg());
            return myResult;
        } else {
            myResult.setCode(1);
            myResult.setMsg("failed");
            System.out.println(myResult.getMsg());
            return myResult;
        }
//        if (!Objects.equals("admin", username) || !Objects.equals("123456", user.getPassword())) {
//            String message = "账号密码错误";
//            System.out.println("test");
//            return new MyResult(400);
//        } else {
//            return new MyResult(200);
//        }
        //return studentService.login(student);
    }

}
