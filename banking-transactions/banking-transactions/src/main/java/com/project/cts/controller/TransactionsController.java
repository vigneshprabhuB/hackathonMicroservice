package com.project.cts.controller;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.cts.model.Account;
import com.project.cts.model.Transaction;
import com.project.cts.model.TransferBalanceRequest;
import com.project.cts.repository.AccountRepository;
import com.project.cts.repository.TransactionRepository;

@RestController
@CrossOrigin(origins="*")
public class TransactionsController {

	
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    TransactionRepository transactionRepository;    
	
	//@RequestMapping("/sendmoney")
	@PostMapping("/sendmoney")
	public Transaction sendMoney(@RequestBody TransferBalanceRequest transferBalanceRequest) {
		System.out.println("transferBalanceRequest....." + transferBalanceRequest);
		String fromAccountNumber = transferBalanceRequest.getFromAccountNumber();
		String toAccountNumber = transferBalanceRequest.getToAccountNumber();
		BigDecimal amount = transferBalanceRequest.getAmount();
		Account fromAccount = accountRepository.findByAccountIdEquals(Long.parseLong(fromAccountNumber));

		if (fromAccount.getCurrentBalance().compareTo(BigDecimal.ONE) == 1
				&& fromAccount.getCurrentBalance().compareTo(amount) == 1) {
			fromAccount.setCurrentBalance(fromAccount.getCurrentBalance().subtract(amount));
			accountRepository.save(fromAccount);
			Transaction transaction = transactionRepository.save(new Transaction(0L, fromAccountNumber, toAccountNumber,
					amount, new Timestamp(System.currentTimeMillis())));
			return transaction;
		}
		return null;
	}
	
	@GetMapping("/account")
    public Account getAccountDetails() {
       
        List<Account> fromAccountList = accountRepository.findAll();
        Account fromAccount = fromAccountList.get(0);
        if(fromAccount!=null){
            return fromAccount;
        }
        return null;
    }
	
	
	@GetMapping("/transaction/all")
	public List<Transaction> getAllTransactions(@RequestParam("accountId") String accountId) {
	List<Transaction> transactionsList = transactionRepository.findByAccountNumberEquals(accountId);
	return transactionsList;
	}
	
}
