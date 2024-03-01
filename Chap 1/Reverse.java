//5.Write a program to print reverse of a number

import java.util.Scanner;

class Reverse
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your No : ");
		int num=sc.nextInt();
		int rev=0;
		System.out.println("You Entered : " +num);
		
		while(num!=0)
		{
			rev=(rev*10)+num%10;
			num=num/10;
		}
		System.out.println("Revesred no : "+rev);
	}
}