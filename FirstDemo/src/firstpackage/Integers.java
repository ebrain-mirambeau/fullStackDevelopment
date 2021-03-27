package firstpackage;
import java.util.*;

public class Integers {
	private Scanner sc;
	private int[] numbers;
	
	public Integers() {
		sc = new Scanner(System.in);
		numbers = new int[10];
	}
	public void input() {
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("Enter a number: ");
			numbers[i] = sc.nextInt();
		}
	}
	public void numberType() {
		for(int number : numbers) {
			if(number % 2 == 0) {
				System.out.println(number + " is even.");
			}
			else {
				System.out.println(number + " is odd.");
			}
		}
	}
	public static void main(String args[]) {
		Integers it = new Integers();
		it.input();
		it.numberType();
	}
}
