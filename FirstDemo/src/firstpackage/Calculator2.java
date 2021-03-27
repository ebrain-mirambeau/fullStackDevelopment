package firstpackage;
import java.util.*;

public class Calculator2 {
	private int int1;
	private int int2;
	public Calculator2(int integer1, int integer2) {
	int1 = integer1;
	int2 = integer2;
	}
	public void addition() {
		int addition = int1 + int2;
		System.out.println("The sum is: " + addition);
	}
	public void product() {
		int product = int1 * int2;
		System.out.println("The product is: " + product);
	}
	public static void main(String args[]) {
		Calculator2 calc2 = new Calculator2(10, 20);
		calc2.addition();
		calc2.product();
	}

}
