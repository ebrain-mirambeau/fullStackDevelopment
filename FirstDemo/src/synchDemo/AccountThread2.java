package synchDemo;

public class AccountThread2 extends Thread{
	Account acc2;
	public AccountThread2() {
		acc2 = new Account();
	}
	public void run() {
		acc2.withdraw(15000);
		System.out.println(acc2.getbalance());
	}
}
