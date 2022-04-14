package com.authentication.jwt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jwt.authentication.model.User;

public interface UserRepo extends MongoRepository<User, Integer> {
    public User findByUsername(String username);

}
