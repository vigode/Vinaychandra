package com.cg.pwa.dao;

import java.util.List;

import com.cg.pwa.beans.Account;
import com.cg.pwa.beans.AccountException;
import com.cg.pwa.beans.Transaction;

public interface AccountDao {
	String AccountEntry(Account account );
	
	List<Account> getAllAccount();
	

	List<Transaction> getAllTransaction();

	

	int AccountWithdrawl(String mobileNumber, int w) throws AccountException;

	int AccountDeposit(String mobileNumber, int d) throws AccountException;

	int MoneyTransfer(String mobile1, String mobile2, int amount)
			throws AccountException;

	

	int  showBalance(String mobile) throws AccountException;

}

