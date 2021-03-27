package threadDemo;

public class CalculateThread2 implements Runnable{
	@Override
	public void run() {
		Calculate calc = new Calculate();
		
		try {
			Thread.sleep(2000);
			System.out.println(calc.sum(3, 4));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String args[])
	{
		Thread ct1 = new Thread(new CalculateThread1());
		Thread ct2 = new Thread(new CalculateThread2());
		
		ct1.setName("Test1");
		ct1.setPriority(2);
		try {
			ct1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ct1.start();
		
		ct2.setName("Test2");
		ct2.setPriority(1);
		try {
			ct2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ct2.start();
	}
}
