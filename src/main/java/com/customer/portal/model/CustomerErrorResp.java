package com.customer.portal.model;

public class CustomerErrorResp {
	private String message;
	private int errorcode;

	public CustomerErrorResp() {

    }

    public CustomerErrorResp(String message, int errorcode) {
        this.message = message;
        this.errorcode = errorcode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public int getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(int errorcode) {
		this.errorcode = errorcode;
	}

}
