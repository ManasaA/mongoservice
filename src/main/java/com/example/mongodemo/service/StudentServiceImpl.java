package com.example.mongodemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.mongodemo.entity.Student;
import com.example.mongodemo.repository.StudentRepository;

@Component
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);

	}

	@Override
	public List<Student> getStudents() {
		
		return studentRepository.findAll();
	}

}
