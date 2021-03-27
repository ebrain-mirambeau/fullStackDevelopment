package employeeInheritance;
import java.util.*;

public class Manager extends Employee {
	private int teamSize;
	private Scanner sc;
	
	public Manager() {
		sc = new Scanner(System.in);
	}
	
	public void reportProjectStatus() {
		System.out.println("My project status is current.");
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize() {
		System.out.println("Enter your team size: ");
		this.teamSize = sc.nextInt();
	}
}
