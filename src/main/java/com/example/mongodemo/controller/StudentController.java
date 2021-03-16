package com.example.mongodemo.controller;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodemo.entity.Student;
import com.example.mongodemo.service.StudentService;

@RestController
@RequestMapping(value = "/api")
public class StudentController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@Autowired
	private StudentService studentService;

	@PostMapping("/students")
	public Student saveStudent(@RequestBody Student student) {
		
		Student result = studentService.saveStudent(student);
		LOG.info("student got created : {}", result.toString());
		return result;
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		
		List<Student> result = studentService.getStudents();
		LOG.info("student got created : {}", result.toString());
		return result;
	}
	

}
