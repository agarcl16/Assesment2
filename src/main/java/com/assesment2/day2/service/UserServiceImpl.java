package com.assesment2.day2.service;

import com.assesment2.day2.model.User;
import com.assesment2.day2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	public UserServiceImpl() {
		this.userRepository = new UserRepository();
	}

	public boolean registerUser(User user) {
		// TODO Auto-generated method stub
		return this.userRepository.register(user);
		
	}

	@Override
	public boolean findUser(User user) {
		// TODO Auto-generated method stub
		return this.userRepository.findUser(user);
	}
}
