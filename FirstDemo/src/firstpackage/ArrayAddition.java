package firstpackage;
import java.util.*;

public class ArrayAddition {
	private int[] array;
	private Scanner sc;
	
	public ArrayAddition() {
		array = new int[5];
		sc = new Scanner(System.in);
	}
	public void input() {
		for(int i = 0; i < array.length; i++){
			System.out.println("Enter a number: ");
			array[i] = sc.nextInt();
		}
	}
	public void sum() {
		int sum = 0;
		for (int index: array) {
			sum += index;
		}
		System.out.println("Sum = " + sum);
	}
	public static void main(String args[]) {
		ArrayAddition add = new ArrayAddition();
		add.input();
		add.sum();
	}
}
