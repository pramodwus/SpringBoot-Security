package com.pack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping(value="/hello")
	public String getHome()
	{
		return "Hello";
	}
	
	@GetMapping(value="/hello/{username}")
	public String getName(@PathVariable String username)
	{
		return "Hello "+username;
		
	}

}
