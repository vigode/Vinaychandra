package com.cg.pwa.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.pwa.beans.Account;
import com.cg.pwa.beans.AccountException;
import com.cg.pwa.service.AccountService;
import com.cg.pwa.service.AccountServiceImpl;

public class validationTest {
	AccountService aser = new AccountServiceImpl();
	Account a = new Account("Vinaychandra", "9422152365", 60000);

	@Test
	public void test() {
		try {
			assertEquals(true, aser.validation(a));
		} catch (AccountException e) {
			System.out.println(e);
		}
	}

}
