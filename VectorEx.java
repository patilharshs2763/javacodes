import java.util.*;
class VectorEx
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Vector v=new Vector();
		System.out.println("\n******** Vector Class Exampl ********");
		System.out.println("current Size : " +v.size());
		v.addElement(new Integer(10));
		v.addElement(new Integer(50));
		v.addElement("java");
		v.addElement("Programming");
		v.addElement(new Float(20.5));
		v.addElement(new Float(15.3));
		System.out.println("All Elements : " +v);
		System.out.println("Now current Size : " +v.size());		
		
		System.out.print("Enter String Element to Remove :");
		String ele=sc.next();
		v.removeElement(ele);
		System.out.println("All Elements:" +v);
		System.out.print("Enter float type Element to Remove :");
		Float e=sc.nextFloat();
		v.removeElement(e);
		System.out.println("All Elements:" +v);
		System.out.print("Enter int type Element to Remove :");
		int e1=sc.nextInt();
		v.removeElement(e1);
		System.out.println("All Elements:" +v);
		
	}
}