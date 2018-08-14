package com.cg.pwa.service;

import java.util.List;

import com.cg.pwa.beans.Account;
import com.cg.pwa.beans.AccountException;
import com.cg.pwa.beans.Transaction;

public interface AccountService {
String AccountEntry(Account account );
int AccountDeposit(String mobile,int d) throws AccountException ;
List<Account> getAll1();

List<Transaction> getAll();

public boolean validation(Account account) throws AccountException;
int AccountWithdrawl(String Mobile, int w) throws AccountException;
int MoneyTransfer(String mobile1, String mobile2, int amount)throws AccountException;
int showBalance(String mobile) throws AccountException;

}