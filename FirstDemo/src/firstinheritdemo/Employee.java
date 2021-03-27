package firstinheritdemo;

import java.util.*;
public class Employee {
	protected Scanner sc;
	private int empid;
	private String name;
	public Employee()
	{
		sc=new Scanner(System.in);
					
	}
	public void acceptDetails()
	{
		System.out.println("Enter Employee id ");
		empid=sc.nextInt();
		System.out.println("Enter Employee name ");
		name=sc.next();
	}
	public void displayDetails()
	{
		System.out.println("Employee id "+empid);
		System.out.println("Employee name "+name);
	}
	

}
