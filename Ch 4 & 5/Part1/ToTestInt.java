/*6.Write a program to create interface named test.
In this interface the member function is square.
Implement this interface in arithmetic class.
Create one new class called ToTestInt in this class use the object of arithmetic class.*/

import java.util.*;
interface test
{
	int square(int number);
}
class Arithmetic implements test
{
	public int square(int number)
	{
		return (number*number);
	}
}
class ToTestint extends student implements Marks
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number= sc.nextInt();
		Arithmetic a= new Arithmetic();
		System. out . print ("Square of "+number+" is "+a.square(number));
	}
}
