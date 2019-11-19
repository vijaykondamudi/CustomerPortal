package com.customer.portal.model;

import java.util.Base64;

import javax.validation.constraints.NotNull;
import org.bson.types.ObjectId;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

@EntityScan
public class Signup {
	
	@Id
	@ApiModelProperty(value = "ID leave it blank", required= false)
	private ObjectId _id;
	
	public String get_id() {
		return _id.toString();
	}
	
	@Indexed(unique = true)
	@NotNull
	@ApiModelProperty(value = "Signup Email", required= true)
	private String email;
	
	private String username;
	@NotNull
	@ApiModelProperty(value = "Signup password", required= true)
	private String password;
	private String firstName;
	private String lastName;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = Base64.getEncoder().encodeToString(password.getBytes());
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
