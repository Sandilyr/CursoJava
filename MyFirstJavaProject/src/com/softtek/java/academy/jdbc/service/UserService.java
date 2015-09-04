package com.softtek.java.academy.jdbc.service;

import com.softtek.java.academy.jdbc.entity.User;
import com.softtek.java.academy.jdbc.repository.UserRepository;

public class UserService {

	public static void main(String[] args) {
		
		UserRepository ur = new UserRepository();
		User user = ur.selectUsers(2);
		System.out.println(user);

	}

}
