package com.project.cts.exception;

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
		TransactionExceptionMessage transactionException=new TransactionExceptionMessage(3001,"Transaction Service is currently Unavailable");
		logger.error("Transaction Service Error : "+3001+" - "+re.getMessage());
		return new ResponseEntity(transactionException,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
