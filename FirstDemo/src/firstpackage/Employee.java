package firstpackage;
import java.util.*;

public class Employee {
	private int empid;
	private String empname;
	private Scanner sc;
	public Employee() {
		sc = new Scanner(System.in);
	}
	public Employee(int x) {
		System.out.println("This is the parameterized constructor.");
	}
	public void accept() {
		System.out.println("Enter Employee ID: ");
		empid = sc.nextInt();
		System.out.println("Enter Employee name: ");
		empname = sc.next();
	}
	public void display() {
		System.out.println("Employee ID:" + empid);
		System.out.println("Employee name: " + empname);
		
	}
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.accept();
		e1.display();
		Employee e2=new Employee(20);
	}
}
