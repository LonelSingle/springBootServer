package com.szh.serviceImpl;

import com.szh.dao.StudentMapper;
import com.szh.model.Student;
import com.szh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> login(Student student) {
        List<Student> studentList = new ArrayList<>();
        studentList = studentMapper.login(student);
        return studentList;
    }

}
