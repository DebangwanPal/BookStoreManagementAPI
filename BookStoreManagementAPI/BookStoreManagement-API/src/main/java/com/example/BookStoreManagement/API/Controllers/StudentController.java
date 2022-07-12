package com.example.BookStoreManagement.API.Controllers;

import java.util.*;
import com.example.BookStoreManagement.API.Entity.Student;
import com.example.BookStoreManagement.API.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/student")

public class StudentController {

    @Autowired
    StudentRepository s;

    @GetMapping("/")
    List<Student> allStudents(){
          return s.findAll();
    }

    @PostMapping("/addStudent")
    Student addStudent(@RequestBody Student st){
        st=s.save(st);
        return st;
    }

    @GetMapping("/regNo/{reg}")
    public Student getStudentByReg(@PathVariable Long reg){
        Student st=s.findByRegNo(reg);
        return st;
    }

    @DeleteMapping("/deleteStudent/{reg}")
    public String deleteStudent(@PathVariable int reg){
        try{
            s.deleteById((long)reg);
        }catch(Exception e){
            return "Not Found";
        }   
        return "Done"; 
    }

    @GetMapping("/name/{name}")
    public Student getStudentByname(@PathVariable String name){
        Student st=s.findByName(name);
        return st;
    }
}
