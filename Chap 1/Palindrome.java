//7.Write a program to find whether given no.is Palindrome or not.

import java.util.*;   
class Palindrome
{  
   public static void main(String args[])  
   {  
		int rem, rev= 0, temp;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :"); 
		n = sc.nextInt();
		temp = n;
		while( n != 0 )
		{
		rem= n % 10;
		rev= rev * 10 + rem;
		n=n/10;
		}
		if (temp == rev)
		System.out.println(temp + " is a palindrome number.");
		else
		System.out.println(temp + " is not a palindrome number.");
   }  
}