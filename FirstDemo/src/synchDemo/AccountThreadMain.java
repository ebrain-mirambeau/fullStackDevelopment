package synchDemo; 

public class AccountThreadMain {
	public static void main(String args[]) {
		AccountThread1  t1 = new AccountThread1();
		AccountThread2  t2 = new AccountThread2();
		t1.run(); t2.run();
	}
}
