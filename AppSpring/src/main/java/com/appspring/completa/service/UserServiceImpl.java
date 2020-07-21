package com.appspring.completa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appspring.completa.model.User;
import com.appspring.completa.repository.IUserRepository;


@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	IUserRepository userRepository;
	
	public Iterable<User> getAllUsers(){
		return userRepository.findAll();
	}
	
}