package com.admbootup.runphase.beneficiaryservice.exception;

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
		BeneficiaryExceptionMessage beneException=new BeneficiaryExceptionMessage(1001,"Beneficiary Service is currently Unavailable");
		logger.error("Beneficiary Service Error : "+1001+" - "+re.getMessage());
		return new ResponseEntity(beneException,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
