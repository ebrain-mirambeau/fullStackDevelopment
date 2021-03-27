package synchDemo;

public class AccountThread1 extends Thread{
	Account acc1;
	public AccountThread1() {
		acc1 = new Account();
	}
	public void run() {
		acc1.withdraw(10000);
		System.out.println(acc1.getbalance());
	} 
}
