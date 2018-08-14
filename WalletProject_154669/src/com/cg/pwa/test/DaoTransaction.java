package com.cg.pwa.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.pwa.beans.Account;
import com.cg.pwa.beans.AccountException;
import com.cg.pwa.dao.AccountDao;
import com.cg.pwa.dao.AccountDaoImpl;

public class DaoTransaction {
	Account a=new Account("Vinaychandra","9422152365",5000);
	Account a1=new Account("Chandra","9422562354",5000);
	AccountDao adao=new AccountDaoImpl();

	@Test
		public void test() {
			adao.AccountEntry(a);
			adao.AccountEntry(a1);
			try {
				assertEquals(4500,adao.MoneyTransfer(a.getNumber(), a1.getNumber(), 500));
			} catch (AccountException e) {
				System.out.println(e);
			}
		}

	}
