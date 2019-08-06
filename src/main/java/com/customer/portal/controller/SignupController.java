package com.customer.portal.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customer.portal.model.Signup;
import com.customer.portal.services.SignupService;

@RestController
public class SignupController {
	
	@Autowired
	private SignupService signupService;
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public Signup login(@Valid @RequestBody Signup loginuser) {
		
		return signupService.createUser(loginuser);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public List<Signup> validateUser( @RequestBody Signup loginuser) {
		return signupService.validateUser(loginuser);
	}

}
