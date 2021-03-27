package threadDemo;

public class MaxNum implements Runnable{
//	Scanner sc = new Scanner(System.in);
	public int max(int a, int b) {
		if (a < b)
			return b;
		else {
			return a;
		}
		
	}
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			MaxNum mx = new MaxNum();
			System.out.println(mx.max(2, 4));
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
