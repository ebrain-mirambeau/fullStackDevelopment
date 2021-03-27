package abstractDemo;

public class MainDemo {
	public static void main(String arg[])
	{
		Employee emp;
		System.out.println("Calling permanent Employee Details");
		emp=new PermanentEmployee();
		emp.acceptDetails();
		emp.calculateSalary();
		emp.displayDetails();
		
		System.out.println("Calling Temp Employee Details ");
		emp=new TempEmployee();
		emp.acceptDetails();
		emp.calculateSalary();
		emp.displayDetails();
	}

}
