package exceptionDemo;

import java.util.Scanner;

public class NumberInArrayCheck {
	private int[] array;
	private int arrayLength;
	private Scanner sc;
	
	public NumberInArrayCheck() {
		sc = new Scanner(System.in);
	}
	public void acceptInput() {
		System.out.println("Enter array length: ");
		arrayLength = sc.nextInt();
		array = new int[arrayLength];
		
		System.out.println("Enter array contents: ");
		
		for(int i = 0; i < arrayLength; i++) {
			System.out.println("Enter a number: ");
			array[i] = sc.nextInt();
		}
	}
	public void checkArrayContents(int number) throws NumberNotInArrayException {
		for (int i = 0; i < arrayLength; i++) {
			if (array[i] == number) {
				System.out.println(number + " is in array.");
				return;
			}
		}
		throw new NumberNotInArrayException();

	}

}
