package com.example.quizserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quizserver.entity.quiz.AttemptedQuiz;

@Repository
public interface AttemptedQuizRepository extends JpaRepository<AttemptedQuiz, Long> {

}