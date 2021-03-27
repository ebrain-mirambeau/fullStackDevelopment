package collegeDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class College {
	private int collegeCode;
	private String collegeName;
	private List<Student> students;
	int numberOfStudents;
	private Scanner sc;
	public College() {
		sc = new Scanner(System.in);
		System.out.println("Enter college code:");
		collegeCode = sc.nextInt();
		System.out.println("Enter college name: ");
		collegeName = sc.next();
		students = new ArrayList<Student>();
	}
	public void acceptDetails() {
		System.out.println("How many students attend this college? ");
		numberOfStudents = sc.nextInt();
		for(int i = 0; i < numberOfStudents; i++) {
			this.addStudent();
		}
	}
	public void addStudent() {
		Student s = new Student();
		System.out.println("Enter student ID: ");
		s.setStudentID(sc.nextInt());
		System.out.println("Enter student name: ");
		s.setStudentName(sc.next());
		System.out.println("Enter student marks: ");
		s.setMarks(sc.next());
		students.add(s);
	}
	public void deleteStudent() {
		Student s = new Student();
		System.out.println("Enter student ID: ");
		s.setStudentID(sc.nextInt());
		System.out.println("Enter student name: ");
		s.setStudentName(sc.next());
		System.out.println("Enter student marks: ");
		s.setMarks(sc.next());
		if (students.contains(s)) {
			students.remove(s);
		}
	}
	public void displayDetails() {
		System.out.println("College name: " + collegeName);
		System.out.println("College code: " + collegeCode);
		for (Student student: students) {
			System.out.println(student.getStudentID());
			System.out.println(student.getStudentName());
			System.out.println(student.getMarks());
		}
	}
}
