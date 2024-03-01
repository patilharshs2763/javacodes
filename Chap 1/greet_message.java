//4.Write a program to display a greet message according to result obtained by student

import java.util.Scanner;
class greet_message
{
   public static void main(String args[])
	{
		int marks;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the marks : ");
		marks=in.nextInt();
		if((marks>=91)&&(marks<=100))
		{
			System.out.println("Grade A");
		}
		if((marks>=90)&&(marks<=81))
		{
			System.out.println("Grade B");
		}
		if((marks>=80)&&(marks<=71))
		{
			System.out.println("Grade C");
		}
		if((marks>=70)&&(marks<=69))
		{
			System.out.println("Grade D");
		}
		if((marks>=60)&&(marks<=51))
		{
			System.out.println("Grade E");
		}
		if((marks<60))
		{
			System.out.println("Poor result..!");
		}
	}
}