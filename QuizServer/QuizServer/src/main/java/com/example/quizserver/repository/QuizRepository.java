package com.example.quizserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quizserver.entity.quiz.Category;
import com.example.quizserver.entity.quiz.Quiz;



@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {

	List<Quiz> findQuizzesByCategory(Category category);
	
	List<Quiz> findByActive(boolean active);
	
	List<Quiz> findByCategoryAndActive(Category category, boolean active);
}