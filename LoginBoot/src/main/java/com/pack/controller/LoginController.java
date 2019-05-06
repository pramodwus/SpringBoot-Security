package com.pack.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pack.dao.LoginDao;
import com.pack.model.LoginModel;

@Controller
public class LoginController {
	@Autowired
	private  LoginDao  dao;
	
	@GetMapping("/loginPage")
	public  ModelAndView  getLoginPage() {
		LoginModel  logModel=new LoginModel();
		return  new ModelAndView("login","logm",logModel);
	}
	
	@PostMapping("/verify")
	public   String  checkUser(@Valid @ModelAttribute("logm")LoginModel logModel, BindingResult result)
	{
		if(result.hasErrors()) {
			return  "login";
		}
		String username=logModel.getUsername();
		String password=logModel.getPassword();
		
		boolean flag=dao.checkDetails(username, password);
		if(flag==true) {
			return  "success";
		}
		else {
			return  "failure";
		}
	}
}






