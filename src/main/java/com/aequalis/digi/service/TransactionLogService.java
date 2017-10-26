/**
 * 
 */
package com.aequalis.digi.service;

import java.util.List;

import com.aequalis.digi.model.TransactionLog;


/**
 * @author anand
 *
 */
public interface TransactionLogService {
	
	public void addTransactionLog(TransactionLog transactionLog);
	
	public List<TransactionLog> findMyTransactions(String useraddress);
}
