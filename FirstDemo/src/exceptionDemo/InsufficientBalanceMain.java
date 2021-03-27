package exceptionDemo;

public class InsufficientBalanceMain {
	public static void main(String args[]) {
		try {
		Account a = new Account();
		a.withdrawFromAccount();
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
