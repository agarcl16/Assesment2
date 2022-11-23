package com.assesment2.day2.service;

import com.assesment2.day2.model.User;

public interface UserService {
	public void save(User user);
	public User findByUserName(String userName);
}
