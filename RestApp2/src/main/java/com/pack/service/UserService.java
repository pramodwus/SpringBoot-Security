package com.pack.service;

import java.util.List;

import com.pack.entity.User;

public interface UserService {

	public List<User> allUsers();
	public User userById(int id);
	public void addUser(User user);
	public void updateUser(User u);
	public void deleteUserById(int userId);
	
}
