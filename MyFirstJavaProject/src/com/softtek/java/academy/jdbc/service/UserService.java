package com.softtek.java.academy.jdbc.service;

import java.util.List;

import com.softtek.java.academy.jdbc.entity.User;
import com.softtek.java.academy.jdbc.repository.UserRepository;

public class UserService {

	public static void main(String[] args) {
		
		final UserRepository ur = new UserRepository();
		//User user = ur.selectUser(2);
		//System.out.println(user);
		final List<User> users = ur.allUsersById();
		System.out.println(users);
		
		
		

	}

}
