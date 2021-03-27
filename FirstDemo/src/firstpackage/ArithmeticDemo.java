package firstpackage;

import java.util.Scanner;

public class ArithmeticDemo {
	private int num1;
	private int num2;
	private Scanner sc;
	public ArithmeticDemo() {
		sc = new Scanner(System.in);
	}
	public void accept() {
		System.out.println("Enter number 1 ");
		num1 = sc.nextInt();
		System.out.println("Enger number 2 ");
		num2 = sc.nextInt();
	}
	public void div() {
		try {
			double result = num1/num2;
			System.out.println("The result is " + result);
		}catch(ArithmeticException ex) {
			System.out.println("Division by zero");
		}
	}
}
