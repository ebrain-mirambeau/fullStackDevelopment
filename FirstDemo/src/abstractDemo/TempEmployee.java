package abstractDemo;

public class TempEmployee extends Employee{

	private double contAmount;
	private int contDuration;
	@Override
	public void acceptDetails()
	{
		super.acceptDetails();
		System.out.println("Enter Cont Amount");
		contAmount=sc.nextDouble();
		System.out.println("Enter Cont Duration");
		contDuration=sc.nextInt();
	}
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("ContAmount is "+contAmount);
	}
	@Override
	public void calculateSalary() {
double salary=contAmount*contDuration;
System.out.println("NEw Salary is "+salary);
	}
	

}
