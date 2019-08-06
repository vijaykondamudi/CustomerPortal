package com.customer.portal.exception;

public class CustomerExceptions extends RuntimeException {
	
	private int errorCode;
	private String errorMessage;
	
	private static final long serialVersionUID = 1L;
	
	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public CustomerExceptions (String message) {
		super(message);
		 this.errorMessage = message;
	}
	
	 public CustomerExceptions(String message, int errorCode) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = message;
    }
	 
	@Override
    public String toString() {
        return this.errorCode + " : " + this.getErrorMessage();
    }

}
