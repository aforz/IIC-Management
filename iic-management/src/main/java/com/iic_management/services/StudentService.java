package com.iic_management.services;

import com.iic_management.entities.Student;

import java.util.List;

public interface StudentService {
    public Student findById(Long id);
    Student saveStudent(Student student);
    List<Student> getAllStudents();
}
