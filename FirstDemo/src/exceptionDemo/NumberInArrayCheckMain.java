package exceptionDemo;
import java.util.*;

public class NumberInArrayCheckMain {
	public static void main(String args[]) {
		try {
			Scanner sc = new Scanner(System.in);
			int numberCheck;
			
			NumberInArrayCheck num = new NumberInArrayCheck();
			num.acceptInput();
			System.out.println("Enter a number to check for in array: ");
			numberCheck = sc.nextInt();
			
			num.checkArrayContents(numberCheck);
		}catch(NumberNotInArrayException e) {
			System.out.println(e.getMessage());
		}
	}
}
