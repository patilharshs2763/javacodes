// Vector Example
import java.util.*;

class ExampleVector
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Vector v=new Vector(4);
		System.out.println("current Size Before adding Elements:" +v.size());
		v.addElement(new Integer(10));
		v.addElement(new Integer(20));
		v.addElement(new Float(15.50));
		v.addElement(new Float(11.5));
		v.addElement("Harsh");
		v.addElement("Patil");
		
		System.out.println("current Size:" +v.size());
		System.out.println("First Element:" +v.firstElement());
		System.out.println("Last Element:" +v.lastElement());
		System.out.println("All Elements:" +v);
		//v.removeElement(15.50);
		System.out.println("Remove 10 Element :" +v.removeElement(15.50));
		//System.out.println("Remove Element:" +v.remove(3));
		System.out.println("All Elements:" +v);
		
		System.out.println("All Elements:" +v);
		System.out.print("Enter String Element to Remove :");
		String ele=sc.next();
		v.removeElement(ele);
		System.out.println("All Elements:" +v);
		System.out.print("Enter float type Element to Remove :");
		Float e=sc.nextFloat();
		v.removeElement(e);
		System.out.println("All Elements:" +v);
	}
}