package threadDemo;

public class CalculateThread1 implements Runnable{
	@Override
	public void run() {
		Calculate calc = new Calculate();
		
		try {
			Thread.sleep(2000);
			System.out.println(calc.sum(1, 2));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
