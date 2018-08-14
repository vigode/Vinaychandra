package com.cg.pwa.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.pwa.beans.Account;
import com.cg.pwa.beans.AccountException;
import com.cg.pwa.dao.AccountDao;
import com.cg.pwa.dao.AccountDaoImpl;

public class daotest {
	AccountDao adao=new AccountDaoImpl();
	Account a1=new Account("Vinaychandra","9422152365",5000);

	@Test
	public void test() {
			adao.AccountEntry(a1);
			try {
				assertEquals(5500,adao.AccountDeposit(a1.getNumber(), 500));
			} catch (AccountException e) {
				System.out.println(e);
			}
			}

		
}
