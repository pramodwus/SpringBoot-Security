package com.pack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.entity.User;
import com.pack.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository repository;
	
	
	@Override
	public List<User> allUsers() {
		
		List list=repository.findAll();
		return list;
	}

	@Override
	public User userById(int id) {
		  User u=repository.findOne(id);
		return u;
	}

	@Override
	public void addUser(User user) {
		repository.saveAndFlush(user);
		
	}

	@Override
	public void updateUser(User u) {
		repository.saveAndFlush(u);
		
	}

	@Override
	public void deleteUserById(int userId) {
		repository.delete(userId);
		
	}

}
