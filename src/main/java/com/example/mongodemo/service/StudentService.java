package com.example.mongodemo.service;

import java.util.List;

import com.example.mongodemo.entity.Student;

public interface StudentService {
	Student saveStudent(Student student);
	List<Student> getStudents();
}
