/**
 * 
 */
package com.project.cts.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.cts.model.Transaction;
/**
 * @author ankur
 *
 */
//@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	List<Transaction> findByAccountNumberEquals(String accountNumber);

}
