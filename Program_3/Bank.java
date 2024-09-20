package Program_3;

import java.util.Scanner;

public class Bank {
	// create one bank class with deposite method take amount from user as input if user enters negative number, then throw custom exception

	public void deposite() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount to Deposite : ");
		int amt = sc.nextInt();
		if (amt < 0) {
			ExceptionClass e = new ExceptionClass();
			e.getMessage();
		} else {
			System.out.println("Amount Succefully Deposite.....");
		}
	}

	public static void main(String[] args) {

		Bank b = new Bank();

		try {
			b.deposite();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
