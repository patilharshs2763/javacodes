////Harshvardhan S Patil(196037)
//Program-Java program to demonstrate working of method overloading in Java.

class sample
{
	public void disp(int a)
	{
	System.out.println("\nHere single parameter integer value :\n"+a);
	}
	public void disp(int b,int c)
	{
	 System.out.println("Here two parameters of integer value : ");
	 System.out.println(""+c);
	 System.out.println(""+c);
	}
	public void disp1(String str)
	{
	 System.out.println("\nHere is string value:"+str);
	}
}
public class MethodOverload
{
	public static void main(String args[])
	{
		sample obj1 = new sample();
		obj1.disp(196037);
		obj1.disp(1010,2020);
		obj1.disp1("Method overloading.....");
	}
}
