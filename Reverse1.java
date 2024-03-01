/*Display a class having one 3 or more digit number as a data member 
and display reverse of that number.
Harshvardhan S Patil (196037)*/

//5.Write a program to print reverse of a number

import java.util.Scanner;

class Reverse1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your No : ");
		int n=sc.nextInt();
		int rev=0;
		System.out.println("You Entered : " +n);
		
		while(n>0)
		{
			rev=(rev*10)+n%10;
			n=n/10;
		}
		System.out.println("Revesred no : "+rev);
	}
}