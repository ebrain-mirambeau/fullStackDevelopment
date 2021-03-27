package firstpackage;

import java.util.Scanner;

public class Homework1 {
	public void product(){
		int number1 = 5;
		int number2 = 2;
		int product = number1 * number2;
		System.out.println("This is the product " + product);
	}
	public void multiplicationTable() {
		int number = 2;
		for(int i = 0 ; i <= 10; i++) {
			System.out.println(number + " * " + i + " = " + number*i);
		}
	}
	public void areaAndPerimeterOfCircle() {
		int radius = 5;
		double perimeter = 3.14 * 2 * radius;
		double area = 3.14 * radius * radius;
		System.out.println("Perimeter = " + perimeter + " and Area = " + area);
	}
	public void swap() {
		int number1 = 5;
		int number2 = 2;
		
		System.out.println("Before: Number1 = " + number1 + " Number2 = " + number2);
		int temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println("After: Number1 = " + number1 + " Number2 = " + number2);
	}
	public void input() {
		int n1; int n2; int n3; int n4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n1 = sc.nextInt();
		System.out.println("Enter a number: ");
		n2 = sc.nextInt();
		System.out.println("Enter a number: ");
		n3 = sc.nextInt();
		System.out.println("Enter a number: ");
		n4 = sc.nextInt();
		sc.close();
		System.out.println(n1 == n2 && n3 == n4);
	}
	public void countCharactersInString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string value: ");
		String str = sc.next();
		int counter = 0;
		
		for (int i = 0; i < str.length(); i++) {
			counter+=1;
		}
		System.out.println(counter);
		sc.close();
	}
	public void reverseString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string followed by a newline character: ");
		String str = sc.nextLine();
		int length = str.length();
		//char[] rev = new char[length];
		
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.toCharArray()[i]);
		}
		sc.close();
	}
	
	public static void main(String args[]) {
		Homework1 hw1 = new Homework1();
		//hw1.product();
		//hw1.multiplicationTable();
		//hw1.areaAndPerimeterOfCircle();
		//hw1.swap();
		//hw1.input();
		//hw1.countCharactersInString();
		hw1.reverseString();
	}
}
