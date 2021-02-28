package com.example.testdb.demodb.service;

import org.springframework.stereotype.Service;

import com.example.testdb.demodb.model.User;
import com.example.testdb.demodb.persistence.UserDAO;
import com.google.gson.Gson;

@Service
public class UserService {
	
	private UserDAO userDAO = UserDAO.getInstance();
	
	public String findAll() {
		return new Gson().toJson(userDAO.get());
	}
	
	public String insert(User user) {
		return new Gson().toJson(userDAO.insert(user.getNome(), user.getCognome()));
	}

}
