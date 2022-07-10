package com.quizzup.quiz.model;


import java.util.ArrayList;

import org.bson.Document;
import org.bson.json.JsonObject;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import lombok.Data;
import net.minidev.json.JSONObject;

@Data
public class Quiz {
	
	@Id
	private String _id;
	private String question;
	private int correctanswer;
	private ArrayList answers;
	
	
}
