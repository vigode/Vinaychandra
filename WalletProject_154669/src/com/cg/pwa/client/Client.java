package com.cg.pwa.client;

import java.util.List;
import java.util.Scanner;

import com.cg.pwa.beans.Account;
import com.cg.pwa.beans.AccountException;
import com.cg.pwa.beans.Transaction;
import com.cg.pwa.service.AccountService;
import com.cg.pwa.service.AccountServiceImpl;

public class Client {

	public static void main(String[] args) {

		AccountService aser = new AccountServiceImpl();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("*-* Welcome to the XYZ Wallet. *-*");
			System.out.println("_______________________________");
			System.out.println(" Options:");
			System.out.println("Enter 1 for Account entry");
			System.out.println("Enter 2 for Balance detail");
			System.out.println("Enter 3 for Withdraw");
			System.out.println("Enter 4 for Deposit");
			System.out.println("Enter 5 for Money transfer");
			System.out.println("Enter 6 for Wallet Details");
			System.out.println("Enter 7 for Transaction Details");
			System.out.println("Enter 8 for Exit");
			System.out.println("_______________________________");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {

				System.out.println("Enter the name of custumer: ");
				sc.nextLine();
				String cname = sc.nextLine();
				System.out.println("Enter mobile number: ");
				String cmobile = sc.nextLine();
				System.out.println("Enter initial balance: ");
				int cbal = sc.nextInt();
				Account a = new Account(cname, cmobile, cbal);
				try {
					if (aser.validation(a))
						aser.AccountEntry(a);
					System.out.println("Congrats !! your account is created");
					System.out.println("________________________________");

				} catch (AccountException e) {
					System.out.println(e);
				}

			}
				break;
			case 2: {
				System.out.println("Enter Mobile number for balance: ");
				sc.nextLine();
				String mob = sc.nextLine();
				try {
					int k = aser.showBalance(mob);
					System.out
							.println("The balance in the account of given mobile number is: "
									+ k);
					System.out
							.println("_________________________________________________________");
				} catch (AccountException e) {
					System.out.println(e);
					System.out.println("________________________");
				}

			}
				break;

			case 3: {

				System.out
						.println("Enter Mobile number you want to withdraw from: ");
				sc.nextLine();
				String acc = sc.next();
				sc.nextLine();
				System.out.println("Enter amount that you want to withdraw: ");
				int aw = sc.nextInt();
				int bal;
				try {
					bal = aser.AccountWithdrawl(acc, aw);
					System.out.println("The remaining balance is: "
							+ bal);
					System.out
							.println("__________________________________________");
				} catch (AccountException e) {
					System.out.println(e);
				}

				break;
			}
			case 4: {
				System.out.println("Enter mobile number for deposit purpose");
				sc.nextLine();
				String acc = sc.nextLine();

				System.out.println("Enter amount that you want to deposit: ");
				int ad = sc.nextInt();
				int bal;
				try {
					bal = aser.AccountDeposit(acc, ad);
					System.out.println("The amount in your account is: " + bal);
				} catch (AccountException e) {
					System.out.println(e);
				}

			}
				break;
			case 5: {
				System.out
						.println("Enter the account ids that you want to do transfer between");
				sc.nextLine();
				String acc1 = sc.nextLine();
				String acc2 = sc.nextLine();
				System.out.println("Enter amount that you want to deposit: ");
				int bal = sc.nextInt();
				int k;

				try {
					k = aser.MoneyTransfer(acc1, acc2, bal);
					System.out.println("Money Transfer Complete");
					// System.out.println("The remaining account balance in account 1 is: "+k);
				} catch (AccountException e) {
					System.out.println(e);
				}
			}

				// System.out.println("The account balance in account 2 is: "+
				// );
				break;

			case 6: {
				System.out.println("The Account Details are as follows: ");
				System.out.println("_____________________________________");
				List<Account> clist = aser.getAll1();
				for (Account acc : clist) {
					System.out.println(acc);

				}
				break;

			}
			case 7: {
				System.out.println("The tansaction details are as follows");
				System.out.println("_________________________________________");
				sc.nextLine();
				List<Transaction> tlist = aser.getAll();
				for (Transaction t : tlist) {
					System.out.println(t);
					System.out.println("_________________________________");
				}
				break;

			}
			
			case 8: {
				System.out.println("*-* Thanks for using XYZ bank payment wallet *-*");
				System.exit(0);

				break;
			}
			default:
				System.out.println("Please enter the correct option");
				break;
			}
		} while (true);

	}

}