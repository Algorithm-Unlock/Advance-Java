package com.example.Springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class exceptionhandler1 {
	@ExceptionHandler(customerException.class)
	public ResponseEntity<ApiError> customerExceptionHandler(customerException e) 
	{
		ApiError apierror = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR);
		apierror.setMessage(e.getMessage());
		return new ResponseEntity<ApiError>(apierror,apierror.getStatus());

	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ApiError> genericExceptionHandler(Exception e) 
	{
		ApiError apierror = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR);
		apierror.setMessage(e.getMessage());
		return new ResponseEntity<ApiError>(apierror, apierror.getStatus());

	}

}
