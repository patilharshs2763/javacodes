//9.Write a program for vector methods.

import java.util.*;
public class vector
{
	public static void main(String[] args)
	{
		Vector v1 = new Vector();
		v1.add("Java");
		v1.add("Nad");
		v1.add("PHP");
		v1.add("ISE");
		v1.add("Sen");
		System.out.println("\nAll Vector Elements : "+v1);
		
		v1.add(4,"OOP");
		System.out.println("\nUpdated Vector elements : "+v1);
		
		System.out.println("\nThe vector element's index 0 value is :"+v1.get(0));
		System.out.println("\nThe vector element's index 1 value is :"+v1.get(1));
		v1.set(3,"Linux");
		System.out.println("\nNow values at index 3 and 4 Vector contains :"+v1);
		v1.addElement("HTML");
		System.out.println("\nAfter adding 1 more element Vector contains :"+v1);
		
		v1.remove("Linux");
		System.out.println("\nAfter removing element :"+v1);
		v1.removeAllElements();
		System.out.println("\nAfter removing all its elements :"+v1);
		System.out.println();
	}
}