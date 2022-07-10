package com.quizzup.quiz.model;

import java.sql.Array;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
public class Users {

  @Id
  private String _id;
  private String name;
  private String email;
  private String version;
  private ArrayList scores;
  private String dateCreated;
 
}
