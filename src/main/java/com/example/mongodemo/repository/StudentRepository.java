
package com.example.mongodemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.mongodemo.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer> {
	
}
