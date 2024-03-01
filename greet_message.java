//4.Write a program to display a greet message according to result obtained by student

import java.util.Scanner;
class greet_message
  {
   public static void main(String a[])
    {
    float result,java,php,nad,total;
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the Java Marks: ");
    java=in.nextFloat();
	System.out.print("Enter the PHP Marks: ");
    php=in.nextFloat();
	System.out.print("Enter the NAD Marks: ");
    nad=in.nextFloat();
	
	total=java+php+nad;
	result=total/3;
	
	
    if( (result>=90) && (result<=100) )
    {
		System.out.println("Grade A");
    }
    else if( (result>=70) && (result<=89) )
    {
        System.out.println("Grade B");
    }
    else if( (result>=60) && (result<=69) )
    {
        System.out.println("Grade C");
    }
    else if( (result>=50) && (result<=59) )
    {
        System.out.println("Grade D");
    }
	else if( (result>=40) && (result<=49) )
	{
        System.out.println("Grade E");
    }
	else
	{
		System.out.println("Fail!");
	}
    }
   }