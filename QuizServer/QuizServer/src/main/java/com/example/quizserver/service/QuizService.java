package com.example.quizserver.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.quizserver.entity.quiz.Category;
import com.example.quizserver.entity.quiz.Quiz;


@Service
public interface QuizService {
	
	public Quiz addQuiz(Quiz quiz);
	
	public Quiz updateQuiz(Quiz quiz);
	
	public Set<Quiz> getQuizzes();
	
	public Quiz getQuizById(Long qid) throws Exception;
	
	public void deleteQuiz(Long qid) throws Exception;

	public List<Quiz> findQuizzesByCategoryId(Category category);
	
	public List<Quiz> findAllActiveQuiz();
	
	public List<Quiz> findAllActiveQuizOfCategory(Category category);

}