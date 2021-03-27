package exceptionDemo;

public class InvalidAgeException extends Exception{
	
@Override
public String getMessage() {
	return "Trying to enter Invalid Age";
}
}
//Any clas which is extending from exception will be treated as 
//Checked exception.
