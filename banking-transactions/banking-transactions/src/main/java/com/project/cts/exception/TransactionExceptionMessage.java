package com.project.cts.exception;

public class TransactionExceptionMessage {
	
	private int errorCode;
	
	private String errMsg;
	
	public TransactionExceptionMessage() {
		
	}

	public TransactionExceptionMessage(int errorCode, String errMsg) {
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
