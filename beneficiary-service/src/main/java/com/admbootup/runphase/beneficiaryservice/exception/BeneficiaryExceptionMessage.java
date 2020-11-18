package com.admbootup.runphase.beneficiaryservice.exception;

public class BeneficiaryExceptionMessage {
	
	private int errorCode;
	
	private String errMsg;
	
	public BeneficiaryExceptionMessage() {
		
	}

	public BeneficiaryExceptionMessage(int errorCode, String errMsg) {
		this.errorCode= errorCode;
		this.errMsg=errMsg;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	
	

}
