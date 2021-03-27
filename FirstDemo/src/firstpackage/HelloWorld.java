package firstpackage;

public class HelloWorld {
	public void accept() {
		System.out.println("Welcome to Java World");
	}
	//Create method calculate() which will display Data and access this method from class object
	public void calculate() {
		System.out.println("Calculating Data");
	}
	public static void main(String args[]) {
		HelloWorld h1; //reference variable of which class HelloWord
		h1 = new HelloWorld(); //It will allocate memory to h1 object.
		h1.accept();
		h1.calculate();
	}
	
}
//Compilation: which is actually checking for syntax errors.
//Execution: Will execute your programs after compilation is done.

//After compilation it will get converted to .class file
//The execution of program will start from main method

//JVM is outside Java program; 
//public: class is accessible to everyone
//static: it can be accessed without creating object of class.
//void: it returns nothing
//main: it is a method name
//String args[] if you want to pass any run time parameters that can be passed

