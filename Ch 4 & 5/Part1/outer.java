/*7.Create an outer class with a function display,
again create another class inside the outer class named inner
with a function called display and call the two functions in the main class.*/

import java.util.*;
class outer
{
	void display()
	{
		System.out.println("\nMethod in Outer class");
	}
	class inner
	{
		void display()
		{
			System.out.println("Method in inner class");
		}
	}
	public static void main(String args[])
	{
		outer o=new outer();
		outer.inner o1=new outer().new inner();
		o.display();
		o1.display();
	}
}