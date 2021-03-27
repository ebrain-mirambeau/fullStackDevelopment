package firstinheritdemo;

public class PermanentEmployee extends Employee{
	private double salary;
	
	@Override
	public void acceptDetails()
	{
		super.acceptDetails();
		System.out.println("Enter Salary ");
		salary=sc.nextDouble();
	}
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Salary is "+salary);
	}
	public static void main(String args[])
	{
		System.out.println("Calling Employee Details ");
		Employee e1=new Employee();
		e1.acceptDetails();
		e1.displayDetails();
		
		System.out.println("Calling Permanenet Employee Details ");
		PermanentEmployee p1=new PermanentEmployee();
		p1.acceptDetails();
		p1.displayDetails();
	}
	
}
