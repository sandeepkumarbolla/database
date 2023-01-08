package com.student.database.controller;

import com.student.database.model.Student;
import com.student.database.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    public StudentRepository studentRepository;

    @GetMapping("/allstudents")
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    @PostMapping("add")
    public String addStudent(@RequestBody Student student){
        studentRepository.save(student);
        return "Student added to the database";

    }
}
