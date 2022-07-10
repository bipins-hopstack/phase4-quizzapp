package com.quizzup.quiz.restcontroller;


import java.util.List;

import com.quizzup.quiz.model.Users;
import com.quizzup.quiz.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizController {


	@Autowired
	UserRepository userepo;
	
	@GetMapping("/users")
	public List<Users> getUsres() {
		System.out.println("inside users------");
		return userepo.findAll();
	}
	@GetMapping("/users/{name}")
	public Users getUsreByName(@PathVariable("name")String name) {
		System.out.println("inside users------"+userepo.findByName(name));
		return userepo.findByName(name);
	}
	
		
	}


