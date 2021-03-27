package employeeInheritance;
import java.util.*;

public class Employee {
	private String name;
	private String address;
	private String phoneNumber;
	private String experience;
	private Scanner sc;
	
	public Employee() {
		sc = new Scanner(System.in);
	}
	public String getName() {
		return name;
	}
	public void setName() {
		System.out.println("Enter your name: ");
		this.name = sc.nextLine();
	}
	public String getAddress() {
		return address;
	}
	public void setAddress() {
		System.out.println("Enter your address: ");
		this.address = sc.nextLine();
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber() {
		System.out.println("Enter your phone number: ");
		this.phoneNumber = sc.nextLine();
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience() {
		System.out.println("Enter your experience: ");
		this.experience = sc.nextLine();
	}
	

}
