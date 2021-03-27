package lambdaDemo;

public class MaxNumLambda {
	public void display() {
		MaxNum max = (int var,int var2)->{
			if (var > var2) {
				return var;
			}
			else {
				return var2;
			}
		};
		System.out.println(max.maximum(3, 4));
		MaxNum multiply = (int var, int var2)->{
			return var*var2;
		};
		System.out.println(multiply.maximum(3,4));
	}
	public static void main(String args[]) {
		MaxNumLambda m = new MaxNumLambda();
		m.display();
	}
}
