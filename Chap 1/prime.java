//10.Write a program to find a given no.is prime or not.

import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{
	int temp,no;
		boolean isPrime=true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number:");
		no=sc.nextInt();
		for(int i=2;i<=no/2;i++)
		{
			temp=no%i;
			if(temp==0)
			{
			isPrime=false;
			break;
			}
		}
		if(isPrime)
			System.out.println(no + " is a Prime number");
		else
			System.out.println(no + " is not a Prime number");
	}
}