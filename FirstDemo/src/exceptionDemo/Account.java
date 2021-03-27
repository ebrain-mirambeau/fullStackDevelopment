package exceptionDemo;

import java.util.Scanner;

public class Account {
	private double balance;
	private Scanner sc;
	public Account() {
		sc = new Scanner(System.in);
		System.out.println("Input balance ");
		balance = sc.nextDouble();
	}
	public void withdrawFromAccount() throws InsufficientBalanceException {
		//try {
			
		System.out.println("Enter amount to withdraw from account");
		double withdrawAmount = sc.nextDouble();
		balance = balance - withdrawAmount;
		
		if(balance < 0) {
			throw new InsufficientBalanceException();
			}
		}
		//catch(InsufficientBalanceException e) {
		//	System.out.println(e.getMessage());
		//}
	}
//}
