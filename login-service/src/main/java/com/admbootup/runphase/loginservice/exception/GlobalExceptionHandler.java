package com.admbootup.runphase.loginservice.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	private Logger logger= LoggerFactory.getLogger(this.getClass());

	@ExceptionHandler(value = RuntimeException.class)
	public ResponseEntity<Object> exception(RuntimeException re){
		LoginExceptionMessage loginException=new LoginExceptionMessage(2001,"Login Service is currently Unavailable");
		logger.error("Login Service Error : "+2001+" - "+re.getMessage());
		return new ResponseEntity(loginException,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
