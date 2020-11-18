package com.admbootup.runphase.loginservice.exception;

public class LoginExceptionMessage {
	
	private int errorCode;
	
	private String errMsg;
	
	public LoginExceptionMessage() {
		
	}

	public LoginExceptionMessage(int errorCode, String errMsg) {
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
