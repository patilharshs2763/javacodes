//2.Program to find maximum number between two numbers

import java.util.Scanner;

class max
{

	public static void main(String[] args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First No:");
		a=sc.nextInt();
		System.out.print("Enter Second No:");
		b=sc.nextInt();

		if(a>b)
		{
			System.out.println(a+" is maximum number");
		}
		else
		{
			System.out.println(b+" is maximum number");
		}
	}
	
}