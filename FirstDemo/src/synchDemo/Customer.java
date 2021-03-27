package synchDemo;

class Customer
{  
	int balance = 10000;  
  
	synchronized void withdraw(int amount) 
	{  
		System.out.println("going to withdraw...");  
  
		if(this.balance<amount)
		{  
			System.out.println("Less balance; waiting for deposit...");  
		try 
		{
			wait();
		}
		
		catch(Exception e) {
		}  
		}
		
	
		
		this.balance-=amount;  
		System.out.println("withdraw completed..."+balance);  
}  

synchronized void deposit(int amount) {  
	System.out.println("going to deposit...");  
	this.balance+=amount;  
	System.out.println("deposit completed... "+balance);  
	notify();  
}  
}
class WithdrawThread extends Thread 
{
	Customer c;
	
	public WithdrawThread(Customer c) {
		this.c=c;
	}
	
	public void run() {
		c.withdraw(5000);
	}
}

class DepositThread extends Thread {
	Customer c;
	
	public DepositThread(Customer c) {
		this.c=c;
	}
	
	public void run() {
		c.deposit(15000);
	}	
}

class Test {  

	public static void main(String[] args) {  
		final Customer c=new Customer();  
		WithdrawThread w=new WithdrawThread(c);
		DepositThread d=new DepositThread(c);
		
		w.start();
		d.start();
	}
}

