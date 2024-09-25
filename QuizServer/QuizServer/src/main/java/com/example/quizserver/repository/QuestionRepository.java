package com.example.quizserver.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quizserver.entity.quiz.Question;
import com.example.quizserver.entity.quiz.Quiz;



@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
	
	Set<Question> findByQuiz(Quiz quiz);

}