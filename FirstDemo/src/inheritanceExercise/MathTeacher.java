package inheritanceExercise;

public class MathTeacher extends Person{
	protected void teachesMath() {
		System.out.println("Math teacher teaches");
	}
	@Override
	protected void walk() {
		System.out.println("Math teacher walks");
	}
	public static void main(String args[]) {
		MathTeacher mt = new MathTeacher();
		mt.teachesMath();
		mt.walk();
	}
}
