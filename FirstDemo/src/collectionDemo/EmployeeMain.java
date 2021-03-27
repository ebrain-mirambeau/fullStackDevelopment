package collectionDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EmployeeMain {
private List<Employee> emplist;
private int noofemployee;
private Scanner sc;
public EmployeeMain()
{
	sc=new Scanner(System.in);
	System.out.println("Enter no of employees ");
	noofemployee=sc.nextInt();
	emplist=new ArrayList<Employee>();
}
public void accept()
{
for(int x=1;x<=noofemployee;x++)
{
	Employee e1=new Employee();
	e1.acceptDetails();
	emplist.add(e1);
}
}
public void displayData()
{
	for(Employee edata:emplist)
	{
		edata.displayDetails();
	}
}
public static void main(String args[])
{
	EmployeeMain empmain=new EmployeeMain();
	empmain.accept();
	empmain.displayData();
}
}
