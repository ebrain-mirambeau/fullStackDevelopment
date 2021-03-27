package exceptionDemo;

public class NumberNotInArrayException extends Exception{
	@Override
	public String getMessage() {
		return "Number not in array.";
	}

}
