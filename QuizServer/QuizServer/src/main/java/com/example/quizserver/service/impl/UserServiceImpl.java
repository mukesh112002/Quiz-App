package com.example.quizserver.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quizserver.entity.User;
import com.example.quizserver.entity.UserRole;
import com.example.quizserver.repository.RoleRepository;
import com.example.quizserver.repository.UserRepository;
import com.example.quizserver.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	

	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		
		User theUser=this.userRepository.findByUsername(user.getUsername());
		
		if(theUser!=null) {
			System.out.println("This username is already exit");
			throw new Exception("this username already exist try again");
		}
		
		else {
			for(UserRole userrole:userRoles) {
				this.roleRepository.save(userrole.getRole());
			}
			user.getUserRole().addAll(userRoles);
			theUser=this.userRepository.save(user);
		}
		return theUser;
	}

    public User findUser(String username) {
		
		return this.userRepository.findByUsername(username);
	}

	public void deleteUser(Long id) {
		
		 this.userRepository.deleteById(id);
	}

}