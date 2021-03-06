package com.customer.portal.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customer.portal.model.Login;
import com.customer.portal.model.Signup;
import com.customer.portal.services.SignupService;

import io.swagger.annotations.ApiOperation;

@RestController
public class SignupController {
	
	@Autowired
	private SignupService signupService;
	
	@ApiOperation(value = "Sign up new customers")
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public Signup signupUser(@Valid @RequestBody Signup loginuser) {
		
		return signupService.createUser(loginuser);
	}
	
	@ApiOperation(value = "Login into customer portal")
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public List<Signup> validateUser( @RequestBody Login loginuser) {
		
		return signupService.validateUser(loginuser);
		
	}
	
	@ApiOperation(value = "Get List of customers")
	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
	public List<Signup> getAllUsers() {
		
		return signupService.getAllUsers();
		
	}

}
