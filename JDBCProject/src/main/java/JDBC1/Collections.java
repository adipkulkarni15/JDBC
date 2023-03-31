package JDBC1;

import java.util.ArrayList;
import java.util.ListIterator;

public class Collections {
	
	public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList <String> ();
		al.add("Aditya");
		al.add("Aditya");
		al.add("Aditya");
		al.add("Aditya");
		al.add("Aditya");
		
		System.out.println(al);
		
		ListIterator <String> i =al.listIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

	
		
	}
	

  
 