package exceptionDemo;
import java.util.*;

public class ArrayException  {
	private Scanner sc;
	int num;
	int array[];
	int x; // you need to add this to make it accessible to the void function
	public ArrayException() {
		sc=new Scanner(System.in);
	}
	
	public void acceptDetails() {
		System.out.println("Enter total no of elements in array:");
	    num=sc.nextInt();
	    array=new int[num];
	    System.out.println("enter "+ num +" numbers here:");
	    
	    for(int i=0; i<num; i++)
	    { 
	    	array[i]=sc.nextInt();
	    }
	    System.out.println("enter find element:");
		x=sc.nextInt();  
		
	}
	//This is the new checkNum function
	public void checkNum() throws InvalidNumberException{
		for (int i = 0; i < array.length; i++) {
			if(array[i] == x) {
				System.out.println("Element found");
				return;
			}
		}
		throw new InvalidNumberException();
	}
   public static void main(String args[]) throws InvalidNumberException 
	{
		ArrayException ar=new ArrayException();
		
			ar.acceptDetails();
			ar.checkNum();
		
	}

}
