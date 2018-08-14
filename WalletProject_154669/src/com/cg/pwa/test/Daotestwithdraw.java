package com.cg.pwa.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.pwa.beans.Account;
import com.cg.pwa.beans.AccountException;
import com.cg.pwa.dao.AccountDao;
import com.cg.pwa.dao.AccountDaoImpl;

public class Daotestwithdraw {
	AccountDao adao = new AccountDaoImpl();
	Account a1 = new Account("Chandra", "9422562354", 50000);

	@Test
	public void test() {
		adao.AccountEntry(a1);
		try {
			assertEquals(45000, adao.AccountWithdrawl(a1.getNumber(), 5000));
		} catch (AccountException e) {
			System.out.println(e);
		}

	}

}
