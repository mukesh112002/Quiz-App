package com.example.quizserver.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quizserver.entity.quiz.Question;
import com.example.quizserver.entity.quiz.Quiz;
import com.example.quizserver.repository.QuestionRepository;
import com.example.quizserver.service.QuestionService;



@Service()
public class QuesServiceImpl implements QuestionService {

	@Autowired 
	private QuestionRepository questionRepository;
	@Override
	public Question addQuestion(Question question) {
		
		return this.questionRepository.save(question);
	}

	@Override
	public Question updateQuestion(Question question) {
		
		return this.questionRepository.save(question);
	}

	@Override
	public Set<Question> getQuestions() {
		
		return new HashSet<>(this.questionRepository.findAll());
	}

	@Override
	public Set<Question> questionsOfQuiz(Quiz quiz) {
		
		return new HashSet<>(this.questionRepository.findByQuiz(quiz));
	}

	@Override
	public void deletequestion(Long quesId) throws Exception {
		Question question=this.questionRepository.findById(quesId).get();
		if(question==null) {
			throw new Exception("Question is not found please enter valid ques id");
		}
		this.questionRepository.deleteById(quesId);

	}

	@Override
	public Question getQuestionById(Long quesId) throws Exception {
		Question question=this.questionRepository.findById(quesId).get();
		if(question==null) {
			throw new Exception("Question is not found please enter valid ques id");
		}
		return question;
	}

}