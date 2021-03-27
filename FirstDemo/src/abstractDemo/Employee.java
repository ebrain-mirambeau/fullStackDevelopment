package abstractDemo;
import java.util.*;
public abstract class Employee {
	private int empid;
	private String name;
	protected Scanner sc;
	public Employee()
	{
		sc=new Scanner(System.in);
	}
	public void acceptDetails()
	{
		System.out.println("Enter employee id ");
		empid=sc.nextInt();
		System.out.println("Enter Employee name ");
		name=sc.next();
	}
	public void displayDetails()
	{
		System.out.println("Employee id "+empid);
		System.out.println("Employee name "+name);
		
	}
	public abstract void calculateSalary(); 

}