package collectionDemo;

import java.util.*;
public class CollOperations {
	private Collection<String> colldata;
	private Collection<String> colldata1;
	public CollOperations()
	{
		colldata=new ArrayList<String>();
		colldata1=new ArrayList<String>();
		colldata.add("one");
		colldata.add("two");
		colldata.add("three");
		colldata1.add("four");
		colldata1.add("one");
		
	}
	public void merge()
	{
		colldata.addAll(colldata1);
		for(String s1:colldata)
		{
			System.out.println("String is "+s1);
		}
		
		colldata.removeAll(colldata1);
		System.out.println("After removing");
		for(String s2:colldata)
		{
			System.out.println("String is "+s2);
		}
		
	}
	
	public static void main(String args[])
	{
		CollOperations coll=new CollOperations();
		coll.merge();
	}


}
