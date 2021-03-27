package collectionDemo;

import java.util.*;
public class Employee {
	private int empid;
	private String empname;
	private double salary;
	private Scanner sc;
	public Employee()
	{
		sc=new Scanner(System.in);
	}
	public void acceptDetails()
	{
		System.out.println("Enter Employee id ");
		empid=sc.nextInt();
		System.out.println("Enter Employee name ");
		empname=sc.next();
		System.out.println("Enter Salary ");
		salary=sc.nextDouble();
		
	}
	public void displayDetails()
	{
		System.out.println("Employee id "+empid);
		System.out.println("Employee name "+empname);
		System.out.println("Salary is "+salary);
	}
	

}

