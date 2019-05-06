package com.pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.entity.User;
import com.pack.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService us;
	
	@GetMapping(value="/users",produces="application/json")
	public ResponseEntity<List<User>> getAllUsers()
	{
		
	List<User> list=us.allUsers();
	return new ResponseEntity<List<User>>(list,HttpStatus.OK);	
	}
	
	@GetMapping(value="/users/{userId}",produces="application/json")
	public User getById(@PathVariable int userId)
	{
	  User u=us.userById(userId);
		return u;
	}
	
	@PostMapping(value="/users/create")
	public String  createNewUser(@RequestBody User user)
	{
		
        us.addUser(user);
		return "New User Added ";
	}
	
	@PutMapping(value="/users/update/{userId}")
	public String  updateUser(@RequestBody User user)
	{
		
        us.updateUser(user);
		return "User updated successfully ";
	}
	
	@DeleteMapping(value="/users/delete/{userId}")
	public String deleteUser(@PathVariable int userId)

	{
    us.deleteUserById(userId);		
		
    return " User Deleted Successfully ";
	}
}
