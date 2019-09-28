package com.szh.service;

import com.szh.model.MyResult;
import com.szh.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> login(Student student);
}
