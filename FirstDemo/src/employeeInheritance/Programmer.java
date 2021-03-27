package employeeInheritance;
import java.util.*;

public class Programmer extends Employee{
	private String programmingLanguages;
	private Scanner sc;
	
	public Programmer() {
		sc = new Scanner(System.in);
	}
	
	public void writeCode() {
		System.out.println("Writing code");
	}
	public String getProgrammingLanguages() {
		return programmingLanguages;
	}
	public void setProgrammingLanguages() {
		System.out.println("Enter your programmaing languages: ");
		this.programmingLanguages = sc.nextLine();
	}
}
