package com.example.quizserver.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.quizserver.entity.UserRole;
import com.example.quizserver.entity.User;



@Service
public interface UserService {
	
	public User createUser(User user,Set<UserRole>userRoles) throws Exception;
    
	public User findUser(String username);
	
	public void deleteUser(Long id);
}