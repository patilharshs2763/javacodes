import java.util.*;
class VectorEx1
{
	public static void main(String args[])
	{
		
		Vector vect1=new Vector();
		System.out.println("\n******** Vector Class Exampl ********");
		vect1.addElement(new Integer(10));
		vect1.addElement(new Integer(50));
		vect1.addElement(new Integer(50));
		vect1.addElement(new Float(20.5));
		vect1.addElement(new Float(15.3));
		vect1.addElement("java");
		vect1.addElement("Programming");
		System.out.println("All Elements : " +vect1);
		System.out.println("The element is: " +vect1.elementAt(4));
		vect1.insertElementAt("Add",2);
		vect1.removeElement(1);
		System.out.println("All Elements in vect1: " +vect1);
		
		/*Vector vect2=new Vector();
		Collection.copy(vect1 , vect2);
		System.out.println("All Elements : " +vect2);
	}
}