import java.util.*;
class vect_ex
{
	public static void main(String args[])
	{
		Vector v=new Vector();
		System.out.println("******** Vector Class Example ********");
		v.addElement("Java");
		v.addElement("Programming");
		System.out.println("All Elements : " +v);
		v.insertElementAt("Hello",0);
		System.out.println("After adding, All elements are:" +v);
		System.out.println("Value at first index:" +v.firstElement());
		System.out.println("Value at last index:" +v.lastElement());
		if(v.contains("Java"))
		{
			System.out.println("Java is present at index "+v.indexOf("Java"));
		}
		else
		{
			System.out.println("Java is not present here");
		}
	}
}