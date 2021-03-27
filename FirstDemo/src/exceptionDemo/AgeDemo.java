package exceptionDemo;

import java.util.*;
public class AgeDemo {
	private Scanner sc;
	int age;
	public AgeDemo()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter age");
		age=sc.nextInt();
		
	}
	public void checkAge()
	{
		try
		{
		if(age<18)
		{
			throw new InvalidAgeException();
		}
		else
		{
			System.out.println("Age is "+age);
		}
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
			
		}
	}
	public static void main(String args[])
	{
		AgeDemo a1=new AgeDemo();
		a1.checkAge();
	}

}
