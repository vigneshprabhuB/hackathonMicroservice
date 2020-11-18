package com.project.cts.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransferBalanceRequest {
	private String fromAccountNumber;
	private String toAccountNumber;
	private BigDecimal amount;
	
	public String getFromAccountNumber() {
		return fromAccountNumber;
	}
	public void setFromAccountNumber(String fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}
	public String getToAccountNumber() {
		return toAccountNumber;
	}
	public void setToAccountNumber(String toAccountNumber) {
		this.toAccountNumber = toAccountNumber;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public TransferBalanceRequest(String fromAccountNumber, String toAccountNumber, BigDecimal amount) {
		super();
		this.fromAccountNumber = fromAccountNumber;
		this.toAccountNumber = toAccountNumber;
		this.amount = amount;
	}
	public TransferBalanceRequest() {
	}
	
	@Override
	public String toString() {
		return "TransferBalanceRequest [fromAccountNumber=" + fromAccountNumber + ", toAccountNumber=" + toAccountNumber
				+ ", amount=" + amount + "]";
	}
	
	
}
