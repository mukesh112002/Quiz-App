package com.example.quizserver.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.quizserver.entity.User;
import com.example.quizserver.exception.UserNotFoundException;
import com.example.quizserver.repository.UserRepository;



@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserRepository theuserrepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User theuser=this.theuserrepository.findByUsername(username);
		
		if(theuser==null) {
			System.out.println("user not found");
			try {
				throw new UserNotFoundException(username);
			} catch (UserNotFoundException e) {
				
				e.printStackTrace();
			}
		}
		return theuser;
	}

	
}