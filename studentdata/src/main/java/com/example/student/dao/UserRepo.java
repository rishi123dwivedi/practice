package com.example.student.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.student.model.User;

public interface UserRepo extends MongoRepository<User, Integer> {
    public User findByUsername(String username);

}
