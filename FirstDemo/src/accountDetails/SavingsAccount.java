package accountDetails;
import java.util.*;

public class SavingsAccount extends Account{
	private double interest;
	private double balance;
	private Scanner sc;
	public SavingsAccount() {
		interest = 0.07;
	}
	public void calculateInterest() {
		System.out.println("Please enter balance");
		balance = sc.nextDouble();
		interest = balance * interest;
	}

}
