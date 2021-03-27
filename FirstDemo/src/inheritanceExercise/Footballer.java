package inheritanceExercise;

public class Footballer extends Person{
	protected void playsFootball() {
		System.out.println("Footballer plays football");
	}
	@Override
	protected void walk() {
		System.out.println("Footballer walks");
	}
	public static void main(String args[]) {
		Footballer f = new Footballer();
		f.playsFootball();
		f.walk();
		f.talk();
		f.eat();
	}
}