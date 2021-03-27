package objequality;


public class EmployeeMain {
	public static void main(String args[])
	{
		Employee e1=new Employee(1,"Dimple",4000);
		Employee e2=new Employee(1,"Dimple",50000);
		if(e1.equals(e2))
		{
			System.out.println("Both are equals");
		}
		else
		{
			System.out.println("They are not equals");
		}
	}

}
