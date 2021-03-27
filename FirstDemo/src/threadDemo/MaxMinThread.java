package threadDemo;

public class MaxMinThread {
	public static void main(String args[]) {
	Thread m1 = new Thread(new MaxNum());
	Thread m2 = new Thread(new MinNum());
	
	m1.start();
	try {
		m1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	m2.start();
	try {
		m2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
