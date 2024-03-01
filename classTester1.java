//Harshvardhan S Patil(196037)
//Program- Method overloading

public class classTester1
{
	public static void main(String args[])
	{
		classTester1 tester=new classTester1();
		System.out.println(tester.add(1,2));
		System.out.println(tester.add(1,2,3));
	}
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
}