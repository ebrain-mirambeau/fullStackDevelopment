package arrdemo;

import java.util.*;
public class ProjectMain {
	int noofproject;
	private Scanner sc;
	private Project prjarr[];
	public ProjectMain()
	{
		sc=new Scanner(System.in);
		System.out.println("How many project details u want to enter");
		noofproject=sc.nextInt();
		prjarr=new Project[noofproject];
		
	}
	public void acceptDetails()
	{
		for(int x=0;x<prjarr.length;x++)
		{
			Project p1=new Project();
			p1.accept();
			prjarr[x]=p1;
		}
	}
	public void displayDetails()
	{
		for(Project p1:prjarr)
		{
			p1.display();
		}
	}
	public static void main(String args[])
	{
		ProjectMain pmain=new ProjectMain();
		pmain.acceptDetails();
		pmain.displayDetails();
	}
}

