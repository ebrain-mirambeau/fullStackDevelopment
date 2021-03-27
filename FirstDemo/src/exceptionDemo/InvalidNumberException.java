package exceptionDemo;

public class InvalidNumberException extends Exception {
	@Override
	public String getMessage() {
		return "Number not in array.";
		
	}

}
