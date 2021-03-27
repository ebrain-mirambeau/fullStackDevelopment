package bankAccountDemo;

public class CheckingAccount extends BankAccount{
	private double instufficientFees;
	public void processCheck(double check) {
		super.deposit(check);
	}

}
