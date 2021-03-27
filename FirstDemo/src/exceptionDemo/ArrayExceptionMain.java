package exceptionDemo;

public class ArrayExceptionMain {
	public static void main(String args[]) {
		ArrayException ae = new ArrayException();
		ae.acceptDetails();
		try {
			ae.checkNum();
		} catch (InvalidNumberException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}
}
