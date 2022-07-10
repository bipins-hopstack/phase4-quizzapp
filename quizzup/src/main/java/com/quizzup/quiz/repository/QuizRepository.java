package com.quizzup.quiz.repository;

import com.quizzup.quiz.model.Quiz;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface QuizRepository extends MongoRepository<Quiz, String> {

}
