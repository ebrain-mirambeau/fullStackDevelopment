package firstpackage;
import java.util.Scanner;

public class Account {
	private Scanner sc;
	double balance;
	double interest;
	public void accept() {
		sc = new Scanner(System.in);
		System.out.println("Enter balance: ");
		balance = sc.nextInt();
		System.out.println("Enter interest: ");
		interest = sc.nextInt();
		
	}
	public void calculateInterest() {
		double calcInterest;
		calcInterest = interest * balance;
		System.out.println("The interest is " + calcInterest);
	}
	public static void main(String args[]) {
		Account a1 = new Account();
		a1.accept();
		a1.calculateInterest();
	}
}
