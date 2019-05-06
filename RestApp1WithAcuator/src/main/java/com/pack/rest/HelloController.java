package com.pack.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value="/hello/{username}", produces="text/html")
	public String sayHello(@PathVariable String username)
	{
		
		return "<h1> Hello "+username+"</h1>";
	}
	
}
