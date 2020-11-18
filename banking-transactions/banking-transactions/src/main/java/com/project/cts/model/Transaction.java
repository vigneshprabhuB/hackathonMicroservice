package com.project.cts.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "transaction")
public class Transaction {
	@Id
	@GeneratedValue
	private Long transactionId;
	private String accountNumber;
	private String toAccountNumber;
	private BigDecimal transactionAmount;
	private Timestamp transactionDateTime;
	
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public Timestamp getTransactionDateTime() {
		return transactionDateTime;
	}
	public void setTransactionDateTime(Timestamp transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}
	
	public String getToAccountNumber() {
		return toAccountNumber;
	}
	public void setToAccountNumber(String toAccountNumber) {
		this.toAccountNumber = toAccountNumber;
	}
	
	public Transaction(Long transactionId, String accountNumber, String toAccountNumber, BigDecimal transactionAmount,
			Timestamp transactionDateTime) {
		super();
		this.transactionId = transactionId;
		this.accountNumber = accountNumber;
		this.toAccountNumber = toAccountNumber;
		this.transactionAmount = transactionAmount;
		this.transactionDateTime = transactionDateTime;
	}
	
	public Transaction() {
		
	}
	
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", accountNumber=" + accountNumber + ", toAccountNumber="
				+ toAccountNumber + ", transactionAmount=" + transactionAmount + ", transactionDateTime="
				+ transactionDateTime + "]";
	}
	
	
	
	
}
