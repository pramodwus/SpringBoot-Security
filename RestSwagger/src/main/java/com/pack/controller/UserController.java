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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(description="The Rest Api Used to perform CURD operation on User")
public class UserController {

	@Autowired
	private UserRepository repository;
	@ApiOperation(value="return all users details from databse")
	@ApiResponses({
		@ApiResponse(code=200,message="users details are return"),
		@ApiResponse(code=404,message="page not found")
	})
	@GetMapping(value="/users",produces="application/json")
	public ResponseEntity<List<User>> getAllUsers()
	{
		
	List list=repository.findAll();
	return new ResponseEntity<List<User>>(list,HttpStatus.OK);	
	}
	@ApiOperation(value="return user  details from databse based on Id")
	@ApiResponses({
		@ApiResponse(code=201,message="user details are return"),
		@ApiResponse(code=404,message="page not found")
	})
	@GetMapping(value="/users/{userId}",produces="application/json")
	public User getById(@ApiParam("the UserId of user")@PathVariable int userId)
	{
	  Optional<User> u=repository.findById(userId);
		User us=u.get();
	  return us;
	}
	@ApiOperation(value="create new user in databse")
	@ApiResponses({
		@ApiResponse(code=201,message="users added in databse"),
		@ApiResponse(code=404,message="the resource dosn't match ")
	})
	@PostMapping(value="/users/create")
	public String  createNewUser(@ApiParam("the inpute is a  user details")@RequestBody User user)
	{
		
        repository.saveAndFlush(user);
		return "<h2> New User Added </h2>";
	}
	@ApiOperation(value="Update a user in  databse")
	@ApiResponses({
		@ApiResponse(code=201,message="users updated in databse"),
		@ApiResponse(code=404,message="the resource dosn't match ")
	})
	@PutMapping(value="/users/update/{userId}")
	public String  updateUser(@ApiParam("the inpute is a updated user details")@RequestBody User user)
	{
		
        repository.saveAndFlush(user);
		return "<h2>User updated successfully </h2>";
	}
	@ApiOperation(value="Delete a user from database by Id")
	@ApiResponses({
		@ApiResponse(code=201,message="users deleted from database"),
		@ApiResponse(code=404,message="the resource dosn't match ")
	})

	@PostMapping(value="/users/delete/{userId}")
	public String deleteUser(@ApiParam("the userid of User")@PathVariable int userId)

	{
    repository.deleteById(userId);		
		
    return "<h2> User Deleted Successfully </h2>";
	}
}
