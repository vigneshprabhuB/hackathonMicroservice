/**
 * 
 */
package com.project.cts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.cts.model.Account;

/**
 * @author ankur
 *
 */
//@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByAccountNumberEquals(String accountNumber);
    Account findByAccountIdEquals(Long accountId);

}