package bankAccountDemo;

public abstract class BankAccount {
	private String owner;
	private double balance;
	public void deposit(double check) {
		balance += check;
	}
	public void withdrawal(int dollars) {
		balance -= dollars;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
