package abstractDemo;

public class PermanentEmployee extends Employee {
	private double basicSalary;
	@Override
	public void acceptDetails()
	{
		super.acceptDetails();
		System.out.println("Enter Basic Salary");
		basicSalary=sc.nextDouble();
	}
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Salary is "+basicSalary);
	}

	@Override
	public void calculateSalary() {
		double salary=basicSalary*12;
		System.out.println("new salary is "+salary);
	}
	public void show()
	{
		
	}

}
