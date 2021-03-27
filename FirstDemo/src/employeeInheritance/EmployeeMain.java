package employeeInheritance;
//import java.util.*;

public class EmployeeMain {
	//private Scanner sc;
	public EmployeeMain() {
		//sc = new Scanner(System.in);
	} 
	public static void main(String args[]) {
		Programmer p = new Programmer();
		System.out.println("Enter programmer's name: ");
		p.setName();
		p.setAddress();
		p.setPhoneNumber();
		p.setProgrammingLanguages();
		
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		System.out.println(p.getPhoneNumber());
		System.out.println(p.getProgrammingLanguages());
	}

}
