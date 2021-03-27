package arrdemo;

import java.util.*;
public class Project {
	private int projectcode;
	private String projecttitle;
	private int duration;
	private Scanner sc;
	public Project()
	{
		sc=new Scanner(System.in);
		
	}
	public void accept()
	{
		System.out.println("Enter Project Code ");
		projectcode=sc.nextInt();
		System.out.println("Enter Project Title ");
		projecttitle=sc.next();
		System.out.println("Enter Duration ");
		duration=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Project Code is "+projectcode);
		System.out.println("Project Title "+projecttitle);
		System.out.println("Project Duration is "+duration);
	}
	
	

}
