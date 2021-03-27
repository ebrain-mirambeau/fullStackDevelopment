package firstpackage;
import java.util.*;

public class Comparison {
	private int num1;
	private int num2;
	private Scanner sc;
	
	public Comparison() {
		sc = new Scanner(System.in);
	}
	public void input() {
		System.out.println("Enter a number: ");
		num1 = sc.nextInt();
		
		System.out.println("Enter another number: ");
		num2 = sc.nextInt();
	}
	public void larger() {
		if (num1 >= num2) {
			System.out.println("The larger number is: " + num1);
		}
		else {
			System.out.println("The larger number is: " + num2);
		}
	}
	public static void main(String args[]) {
		Comparison cmp = new Comparison();
		cmp.input();
		cmp.larger();
	}
}
