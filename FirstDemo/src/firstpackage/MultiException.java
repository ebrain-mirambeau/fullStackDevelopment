package firstpackage;

public class MultiException {
	int arg[]= {20,10,0};
	public void check()
	{
		try
		{
		double result=arg[0]/arg[2];
		System.out.println("Result is "+result);
		}
		
		catch(ArithmeticException ex)
		{
			System.out.println("trying to divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
			System.out.println("Trying to access elements beyound limit ");
		}
		catch(Exception e)
		{
			System.out.println("Will handle any type of exception");
		}
		
		
		
	}
	public static void main(String args[])
	{
		MultiException mul=new MultiException();
		mul.check();
	}
	

}
