package com.pack.controller;

import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.pack.model.User;

@Controller
public class CurdController
{

   @GetMapping(value="/adduser")
   public ModelAndView addUser()
   {
	   return new ModelAndView("adduser");
   }
	@PostMapping(value="/saveUser")
	public ModelAndView saveUser(HttpServletRequest request)
	{
		
		RestTemplate builder=new RestTemplate();
		User user=new User();
		user.setUserId(Integer.parseInt(request.getParameter("userId")));
		user.setUserName(request.getParameter("userName"));
		user.setEmail(request.getParameter("email"));
		
		builder.postForObject("http://localhost:4343/RestCurdApi/users/create",user, String.class);
		
		return new ModelAndView("index","msg","Record Added sucessfully");
		
	}
	
	@GetMapping(value="/showusers")
	public ModelAndView showUser()
	{
		RestTemplate builder=new RestTemplate();
		List<LinkedHashMap<User, List>> usersMap = builder.getForObject("http://localhost:4343/RestCurdApi/users", List.class);
		return new ModelAndView("display","data",usersMap);
		 
	}
	
	@GetMapping(value="/showbyid")
	public ModelAndView showById()
	{
		return new ModelAndView("showById");
		
	}
	@PostMapping(value="userbyid")
	public ModelAndView getUserById(HttpServletRequest request)
	{
		
			RestTemplate builder=new RestTemplate();
			ResponseEntity<User> user=builder.exchange("http://localhost:4343/RestCurdApi/users/"+request.getParameter("userId"),HttpMethod.GET,null,User.class);
		     User u=user.getBody();
		     return new ModelAndView("displaybyid","d",u);
		
	}
	
	@GetMapping(value="/update")
    public ModelAndView update()
    {
		return new ModelAndView("update");
		
    }
	
	@PostMapping(value="updateUser")
	public ModelAndView updateUser(HttpServletRequest request)
	{
		User us=new User();
		us.setUserId(Integer.parseInt(request.getParameter("userId")));
		us.setUserName(request.getParameter("userName"));
		us.setEmail(request.getParameter("email"));
		RestTemplate builder=new RestTemplate();	
		
				HttpEntity<User> entity=new HttpEntity<User>(us);
				ResponseEntity<String> user=builder.exchange("http://localhost:4343/RestCurdApi/users/update/"+request.getParameter("userId"),HttpMethod.PUT,entity,String.class);
		            		String str=user.getBody();

		       		return new ModelAndView("index","msg1","message");

		
		
	}
	
	@GetMapping(value="/delete")
	public ModelAndView deletUser()
	{
	 
		return new ModelAndView("delete");
	
	}
	@PostMapping(value="deleteUser")
	public ModelAndView delete(HttpServletRequest request)
	{
	
		RestTemplate builder=new RestTemplate();
		ResponseEntity<String> entity=builder.exchange("http://localhost:4343/RestCurdApi/users/delete/"+request.getParameter("userId"),HttpMethod.POST, null,String.class );
		String message=entity.getBody();
		return new ModelAndView("index","msg2",message);
		
	}
	
	}


