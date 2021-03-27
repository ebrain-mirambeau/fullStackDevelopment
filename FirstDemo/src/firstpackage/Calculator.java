package firstpackage;

public class Calculator {
	int var1; //variable var1 of int type
	int var2; //Declaration of variable
	public void accept() {
		var1 = 40;
		var2 = 50;
	}
	public void calculate() {
		int result = var1 + var2;
		System.out.println("The result is " + result);
	}
	public static void main(String args[]) {
		Calculator c1 = new Calculator();
		c1.accept();
		c1.calculate();
	}
	
}

//Create a class called Account class which will have variables like balances and interest
//Create ethod called accept and calculateInterest 
//accpt method will initialize values in variables and calculateInterest
//will calculateInterest, which will be 5% of balance
//declare balance as interest as double because it can accept decimal values also