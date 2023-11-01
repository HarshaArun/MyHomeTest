package SampleArray;

import java.util.ArrayList;
import java.util.Iterator;



public class ArraySamp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> country=new ArrayList<String>();
		country.add("India");
		country.add("Australia");
		country.add("Britian");
		System.out.println("New ArrayList "+ country);
		
		//get an element from the aaraylist
		String st=country.get(1);
		System.out.println("Country at index 1 " + st);
		
		//changing an arraylist element
		country.set(2, "Japan");
		System.out.println("Changing at index 2 "+ country);
		
		//adding an element from aaraylist
		country.add("Africa");
		System.out.println("Adding new element " + country);
		
		//removing an element from arraylist
		country.remove(3);
		System.out.println("removing an element " + country);
		
		//size of arraylist
		System.out.println("Size of the Arraylist " + country.size());
		
		//contains all element
		boolean boo=country.containsAll( country);
		System.out.println(" value of element " + boo);
		
		System.out.println("Iterator");
		 
		Iterator<String> coun=country.iterator();
		 while(coun.hasNext())
		 {
			 System.out.println(coun.next());
		 }
		 
		 // inserting an element
		 country.add("France");
		 System.out.println("Inserting an element " +country );
		 
		 
		 boolean bo=country.containsAll(country);
		 System.out.println("Value: " + bo);
		 
		//size of arraylist
			System.out.println("Size of the Arraylist " + country.size());

		
	}

}
