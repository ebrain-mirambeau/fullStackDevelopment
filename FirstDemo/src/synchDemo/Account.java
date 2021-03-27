package synchDemo;

public class Account {
	double balance;
	public Account() {
		balance = 30000;
	}
	synchronized void withdraw(double amount) {
		balance -= amount;
		if (amount > balance) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public double getbalance() {
		return balance;
	}
	synchronized void deposit(double amount) {
		System.out.println("going to deposit...");  
		this.balance+=amount;  
		System.out.println("deposit completed... "+balance);  
		notify(); 
	}
}
