package com.pack.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.entity.User;
import com.pack.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository repository;
	
	@GetMapping(value="/users",produces="application/json")
	public ResponseEntity<List<User>> getAllUsers()
	{
		
	List list=repository.findAll();
	return new ResponseEntity<List<User>>(list,HttpStatus.OK);	
	}
	
	@GetMapping(value="/users/{userId}",produces="application/json")
	public User getById(@PathVariable int userId)
	{
	  Optional<User> u=repository.findById(userId);
		User us=u.get();
	    return us;
	}
	
	@PostMapping(value="/users/create")
	public String  createNewUser(@RequestBody User user)
	{
		
        repository.saveAndFlush(user);
		return "<h2> New User Added </h2>";
	}
	
	@PutMapping(value="/users/update/{userId}")
	public String  updateUser(@RequestBody User user)
	{
		
        repository.saveAndFlush(user);
		return "<h2>User updated successfully </h2>";
	}
	
	@PostMapping(value="/users/delete/{userId}")
	public String deleteUser(@PathVariable int userId)

	{
    repository.deleteById(userId);		
		
    return "<h2> User Deleted Successfully </h2>";
	}
}
