package collectionDemo;

import java.util.*;
public class BasicOp {
	Collection< String> c1;
	private Scanner sc;
	int noofrecords;
	public BasicOp()
	{
		c1=new ArrayList<String>();
		sc=new Scanner(System.in);
		System.out.println("Enter no of Records");
		noofrecords=sc.nextInt();
		
	}
	public void acceptDetails()
	{
		for(int x=1;x<=noofrecords;x++)
		{
			System.out.println("Enter values");
			c1.add(sc.next());
		}
	}
	public void displayDetails()
	{
		for(String str:c1)
		{
			System.out.println("String is "+str);
		}
			
	}
	public void removeDetails(Object o) {
		if (c1.contains(o)) {
			c1.remove(o);
		}
	}
	public static void main(String args[])
	{
		BasicOp basic=new BasicOp();
		basic.acceptDetails();
		basic.displayDetails();
		basic.removeDetails("Hello");
		basic.displayDetails();
	}
	

}
