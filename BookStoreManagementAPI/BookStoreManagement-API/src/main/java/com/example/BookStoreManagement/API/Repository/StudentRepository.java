package com.example.BookStoreManagement.API.Repository;

import com.example.BookStoreManagement.API.Entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student ,Long>{
    Student findByRegNo(Long RegNo);
    Student findByName(String name);
}