/**
 * 
 */
package com.project.cts.model;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ankur
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountStatement {
    BigDecimal currentBalance;
    List<Transaction> transactionHistory;
}
