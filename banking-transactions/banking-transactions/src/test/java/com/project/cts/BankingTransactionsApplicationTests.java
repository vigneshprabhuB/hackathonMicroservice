package com.project.cts;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.cts.model.Account;
import com.project.cts.model.TransferBalanceRequest;
import com.project.cts.repository.AccountRepository;
import com.project.cts.service.TransactionServiceImpl;

@SpringBootTest
class BankingTransactionsApplicationTests {

	/*
	 * @Test public void sendMoneyTest() {​ Account account1 = new Account(101L,
	 * "Ankur Saxena", new BigDecimal(50000)); Account account2 = new Account(102L,
	 * "Srinivasan", new BigDecimal(2000)); accountRepository.save(account1);
	 * accountRepository.save(account2);
	 * 
	 * TransferBalanceRequest transferBalanceRequest = new TransferBalanceRequest(
	 * account1.getAccountNumber(), account2.getAccountNumber(), new
	 * BigDecimal(3000) );
	 * 
	 * transactionServiceImpl.sendMoney(transferBalanceRequest);
	 * 
	 * }
	 * 
	 * @Autowired AccountRepository accountRepository;
	 * 
	 * @Autowired TransactionServiceImpl transactionServiceImpl;
	 */

}
