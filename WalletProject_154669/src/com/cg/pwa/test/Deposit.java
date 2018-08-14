package com.cg.pwa.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.pwa.beans.Account;
import com.cg.pwa.beans.AccountException;
import com.cg.pwa.service.AccountService;
import com.cg.pwa.service.AccountServiceImpl;

public class Deposit {
	Account a=new Account("Vinaychandra","9422152365",5000);
	AccountService a1=new AccountServiceImpl();

	@Test
	public void test() {
		a1.AccountEntry(a);
		try {
			assertEquals(5500,a1.AccountDeposit(a.getNumber(), 500));
		} catch (AccountException e) {
			System.out.println(e);
		}
	}

}
