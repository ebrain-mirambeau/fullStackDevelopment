package softwareDesign;

class Singleton{
	private static Singleton instance;
	private static int counter = 0;
	private Singleton() {}
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	public void output() {
		System.out.println(counter);
	}
	public void increment() {
		counter++;
	}
	public static void main(String[] args) {
		Singleton s = new Singleton();
//		Singleton.getInstance();
		s.output();
		Singleton t = new Singleton();
		t.increment();
		t.output();
		Singleton u = new Singleton();
		t.increment();
		u.output();
//		Singleton.output();
//		Singleton.getInstance().output();
//		Singleton.getInstance().output();
//		Singleton.output();
//		Singleton.output();
		
		
	}
}
