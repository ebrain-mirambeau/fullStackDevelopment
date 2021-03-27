package exceptionDemo;

public class InsufficientBalanceException extends Exception{
	@Override
	public String getMessage() {
		return "Trying to overdraw from account";
	}
}
