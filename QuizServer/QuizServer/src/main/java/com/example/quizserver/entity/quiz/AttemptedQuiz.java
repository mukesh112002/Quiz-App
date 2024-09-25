package com.example.quizserver.entity.quiz;

import java.util.LinkedHashSet;
import java.util.Set;



import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class AttemptedQuiz {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String username;
	
	@OneToMany(mappedBy="attemptedQuiz",cascade=CascadeType.ALL)
	@JsonIgnore
	private Set<QuizQuestions> questions=new LinkedHashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Set<QuizQuestions> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<QuizQuestions> questions) {
		this.questions = questions;
	}

	public AttemptedQuiz(Long id, String username, Set<QuizQuestions> questions) {
		super();
		this.id = id;
		this.username = username;
		this.questions = questions;
	}

	public AttemptedQuiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	

}