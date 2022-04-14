package com.authentication.jwt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jwt.authentication.model.Role;

public interface RoleRepo extends MongoRepository<Role, Integer>{

}
