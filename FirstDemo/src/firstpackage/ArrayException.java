package firstpackage;

public class ArrayException {
	private int[] array;
	public ArrayException() {
		array = new int[10];
	}
	public void populateArray(int limit) {
		try {
			for (int i = 0; i < limit; i++) {
				array[i] = i;
			}
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array index out of bounds.");
		}
	}
	public static void main(String args[]) {
		ArrayException a = new ArrayException();
		a.populateArray(11);
	}
}

