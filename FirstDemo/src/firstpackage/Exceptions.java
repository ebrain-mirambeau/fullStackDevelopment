package firstpackage;

public class Exceptions {
	public Exceptions() {
		
	}
	public void integerConversion() {
		int a = Integer.parseInt("2day");
		System.out.println(a);
	}
	public void arrayStore() {
		Object x[] = new String[3];
		x[0] = new Integer(0);
	}
	public static void main(String args[]) {
		try {
			Exceptions exceptions = new Exceptions();
			exceptions.integerConversion();
			exceptions.arrayStore();
		}
		catch (ArrayStoreException ex) {
			System.out.println("Assigning wrong type to array.");
		}
		catch (NumberFormatException ex) {
			System.out.println("Cannot convert string to integer value.");
		}
	}

}
