package com.customer.portal.services;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.portal.exception.CustomerExceptions;
import com.customer.portal.model.Login;
import com.customer.portal.model.Signup;
import com.customer.portal.repo.SignupRepo;

@Service
public class SignupService {
	
	@Autowired
	SignupRepo signupRepo;
	
	public Signup createUser(Signup userData) {
		//List<Signup> data = signupRepo.findByEmail(userData.getEmail());
		List<Signup> data = signupRepo.findByusername(userData.getUsername());
		if(data.size() == 0) {
			signupRepo.save(userData);
			return userData;
		} else {
			throw new CustomerExceptions("Email already exists", 404);
		}
	}
	
	public List<Signup> validateUser (Login userData) {
		List<Signup> data = signupRepo.findByEmail(userData.getEmail());
		
		byte[] decodedDBPassBytes = Base64.getDecoder().decode(data.get(0).getPassword());
		String decodedPassword = new String(decodedDBPassBytes);
		
		byte[] decodedloginpassBytes = Base64.getDecoder().decode(userData.getPassword());
		String decodedloginPass = new String(decodedloginpassBytes);
		
		if(decodedPassword.equals(decodedloginPass)) {
			return data;
		} else {
			throw new CustomerExceptions("No User Found", 404);
		}
	}
	
	public List<Signup> getAllUsers() {
		List<Signup> data = signupRepo.findAll();
		if(!(data.size() == 0)) {
			return data;
		} else {
			throw new CustomerExceptions("No Customers found", 404);
		}
	}
}
