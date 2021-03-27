package studentDemo;
import java.util.*;

public class Student {
	//stuent code
	//student name
	//marks
	private int studentCode;
	private String studentName;
	private String marks;
	private Scanner sc;
	
	public Student() {
		sc = new Scanner(System.in);
	}
	public int getStudentCode() {
		return studentCode;
	}
	public void setStudentCode() {
		studentCode = sc.nextInt();
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName() {
		studentName = sc.next();
	}
	public String getStudentMarks() {
		return marks;
	}
	public void setStudentMarks() {
		marks = sc.nextLine();
	}
}
