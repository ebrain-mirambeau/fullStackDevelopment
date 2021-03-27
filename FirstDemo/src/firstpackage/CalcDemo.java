package firstpackage;
import java.util.Scanner;

public class CalcDemo {
	private Scanner sc;
	int number1;
	int number2;
	
	public void accept() {
		sc = new Scanner(System.in); //here we are initializing scanner class.
		//takes in input from user (keyboard)
		System.out.println("Enter first number: ");
		number1 = sc.nextInt();
		System.out.println("Enter second number: ");
		number2 = sc.nextInt();
	}
	public void calculate() {
		int result = number1 + number2;
		System.out.print("Result is " + result);
	}
	public static void main(String args[]) {
		CalcDemo cd = new CalcDemo();
		cd.accept();
		cd.calculate();
	}
}
