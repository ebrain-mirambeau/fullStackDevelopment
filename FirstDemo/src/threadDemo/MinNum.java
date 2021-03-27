package threadDemo;

public class MinNum implements Runnable{
	public int min(int a, int b) {
		if (a < b) {
			return a;
		}
		else {
			return b;
		}
	}
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			MinNum mn = new MinNum();
			System.out.println(mn.min(1, 4));
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
