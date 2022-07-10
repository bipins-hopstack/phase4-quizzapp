package com.quizzup.quiz.repository;


import com.quizzup.quiz.model.Users;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@RestResource
public interface UserRepository extends MongoRepository<Users, String> {
//public Users findByVersion(String name);
public Users findByName(String name);
}