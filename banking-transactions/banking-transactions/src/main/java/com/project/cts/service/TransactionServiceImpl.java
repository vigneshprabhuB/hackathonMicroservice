/**
 * 
 */
package com.project.cts.service;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.cts.model.Account;
import com.project.cts.model.Transaction;
import com.project.cts.model.TransferBalanceRequest;
import com.project.cts.repository.AccountRepository;
import com.project.cts.repository.TransactionRepository;

/**
 * @author ankur
 *
 */
@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	TransactionRepository transactionRepository;
	
	/**
	 * 
	 */
	public Transaction sendMoney(TransferBalanceRequest transferBalanceRequest) 
	{
        String fromAccountNumber = transferBalanceRequest.getFromAccountNumber();
        String toAccountNumber = transferBalanceRequest.getToAccountNumber();
        BigDecimal amount = transferBalanceRequest.getAmount();
        Account fromAccount = accountRepository.findByAccountNumberEquals(
                fromAccountNumber
        );
        Account toAccount = accountRepository.findByAccountNumberEquals(toAccountNumber);
        if(fromAccount.getCurrentBalance().compareTo(BigDecimal.ONE) == 1
                && fromAccount.getCurrentBalance().compareTo(amount) == 1
        ){
            fromAccount.setCurrentBalance(fromAccount.getCurrentBalance().subtract(amount));
            accountRepository.save(fromAccount);
            toAccount.setCurrentBalance(toAccount.getCurrentBalance().add(amount));
            accountRepository.save(toAccount);
            Transaction transaction = transactionRepository.save(new Transaction(0L,fromAccountNumber,toAccountNumber,amount,new Timestamp(System.currentTimeMillis())));
            return transaction;
        }
        return null;
    }

}
