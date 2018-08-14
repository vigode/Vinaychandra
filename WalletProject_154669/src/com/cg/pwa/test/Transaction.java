package com.cg.pwa.test;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import com.cg.pwa.beans.Account;
import com.cg.pwa.beans.AccountException;
import com.cg.pwa.service.AccountService;
import com.cg.pwa.service.AccountServiceImpl;

public class Transaction {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
Account a=new Account("Vinaychandra","9422152365",5000);
Account a1=new Account("Chandra","9422562354",5000);

AccountService s1=new AccountServiceImpl();

	@Test
	public void test() {
		s1.AccountEntry(a);
		s1.AccountEntry(a1);
		try {
			assertEquals(4500,s1.MoneyTransfer(a.getNumber(), a1.getNumber(), 500));
		} catch (AccountException e) {
			System.out.println(e);
					}
	}

}
