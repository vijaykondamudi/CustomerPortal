package com.customer.portal.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

import com.customer.portal.exception.CustomerExceptions;
import com.customer.portal.model.CustomerErrorResp;

@ControllerAdvice
public class ErrorHandler {
	
	@ExceptionHandler(CustomerExceptions.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public CustomerErrorResp handleException(CustomerExceptions se) {
		CustomerErrorResp response = new CustomerErrorResp(se.getErrorMessage(), se.getErrorCode());
        return response;
    }

}
