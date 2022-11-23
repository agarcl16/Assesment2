package com.assesment2.day2.service;

import com.assesment2.day2.model.User;

public interface UserService {
	public boolean registerUser(User user);

	public boolean findUser(User user);
}
