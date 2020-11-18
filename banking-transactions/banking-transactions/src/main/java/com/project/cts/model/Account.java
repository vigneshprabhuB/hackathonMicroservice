/**
 * 
 */
package com.project.cts.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ankur
 *
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "account")
public class Account {

	@Id
	@GeneratedValue
	private Long accountId;

	String accountNumber;

	BigDecimal currentBalance;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}

	public Account(Long accountId, String accountNumber, BigDecimal currentBalance) {
		super();
		this.accountId = accountId;
		this.accountNumber = accountNumber;
		this.currentBalance = currentBalance;
	}

	public Account() {
	}
	
		

}
