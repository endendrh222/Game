package test;

import test.Account;
import java.util.Scanner;

public class BankApplication {
//	Scanner scanner = new Scanner(System.in);
	Account account = new Account();
	public static void main(String[] args) {
		Account account = new Account();

		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000

		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000

		account.setBalance(2000000);
		System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000

		account.setBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 300000

	}
}

