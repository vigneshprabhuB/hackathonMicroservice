/**
 * 
 */
package com.project.cts.service;

import java.util.List;

import com.project.cts.model.Account;
import com.project.cts.model.AccountStatement;
import com.project.cts.model.Transaction;
import com.project.cts.model.TransferBalanceRequest;

/**
 * @author ankur
 *
 */
public interface AccountService {
    List<Account> findAll();
    Account save(Account account);
    Transaction sendMoney(TransferBalanceRequest transferBalanceRequest);
    AccountStatement getStatement(String accountNumber);
}