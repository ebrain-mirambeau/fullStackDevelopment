package studentDemo;
import java.util.*;

public class StudentMain {
	private Scanner sc;
	private int numberOfRecords;
	private Student[] records;
	public StudentMain() {
		sc = new Scanner(System.in);
	}
	public void accept() {
		System.out.println("Please enter number of records: ");
		numberOfRecords = sc.nextInt();
		System.out.print(numberOfRecords);
		records = new Student[numberOfRecords];
	}
	public void populateRecords() {
		for (int i = 0; i < numberOfRecords; i++) {
			Student student = new Student();
			System.out.print(i);
			student.setStudentCode();
			student.setStudentName();
			student.setStudentMarks();
			records[i] = student;
			
		}
	}
	public void printRecords() {
		for(Student student : records) {
			System.out.println(student.getStudentCode());
			System.out.println(student.getStudentName());
			System.out.println(student.getStudentMarks());
		}
	}
	public static void main(String[] args) {
		StudentMain st = new StudentMain();
		st.accept();
		st.populateRecords();
		st.printRecords();
	}
}
