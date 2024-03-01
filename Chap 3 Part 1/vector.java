//4.	wap to implement a Program using vector class

import java.util.*;

class vector
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Vector v= new Vector(4);
		System.out.println("\n******** Vector Class Exampl ********");
		System.out.println("current Size:" +v.size());
		v.addElement(new Integer(10));
		v.addElement(new Integer(20));
		v.addElement(new Float(15.50));
		v.addElement(new Float(11.5));
		v.addElement("Harsh");
		v.addElement("Patil");
		
		System.out.println("current Size:" +v.size());
		System.out.println("All Elements:" +v);
		System.out.println("First Element:" +v.firstElement());
		System.out.println("Last Element:" +v.lastElement());
	}
}