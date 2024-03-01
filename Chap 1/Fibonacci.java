//8.Write a program to generate Fibonacci series.

import java.util.*;
public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t1 = 0, t2 = 1;
		int n;
		int sum;
		System.out.print("Enter the number : ");
		n=sc.nextInt();
		System.out.println("First " + n + " numbers fibonnaci series: ");
		for (int i = 1; i <= n; ++i)
		{
			System.out.print(t1 + " ");
			sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
	}
}