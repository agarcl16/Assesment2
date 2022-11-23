package com.assesment2.day2.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.assesment2.day2.model.User;

@Repository
public class UserRepository {
	List<User> users;
	private static User user1= new User("987654", "Pedro", "Pica");
	private static User user2= new User("987653", "ARo", "adfasf");
	private static User user3= new User("987652", "Pedasfadro", "dghfd");
	
	public UserRepository() {
		users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
	}
	public User findByUserName(String userName) {
		for(User user : users) {
			if(user.getUserName().equals(userName)) {
				return user;
			}
		}
		return null;
	}
	public boolean register(User user) {
		// TODO Auto-generated method stub
		for(User u: users) {
			if(u.getId().equals(user.getId())) {
				return false;
			}
		}
		users.add(user);
		return true;
	}
}
