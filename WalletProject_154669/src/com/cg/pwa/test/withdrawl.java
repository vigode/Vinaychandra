package com.cg.pwa.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.pwa.beans.Account;
import com.cg.pwa.beans.AccountException;
import com.cg.pwa.service.AccountService;
import com.cg.pwa.service.AccountServiceImpl;

public class withdrawl {
	AccountService z = new AccountServiceImpl();
	Account z1 = new Account("Vinaychandra", "9422152365", 50000);

	@Test
	public void test() {
		z.AccountEntry(z1);
		try {
			assertEquals(45000, z.AccountWithdrawl(z1.getNumber(), 5000));
		} catch (AccountException e) {
			System.out.println(e);
		}
	}

}