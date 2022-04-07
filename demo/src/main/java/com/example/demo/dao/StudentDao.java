package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Student;

public interface StudentDao extends MongoRepository<Student, Integer> {

}
