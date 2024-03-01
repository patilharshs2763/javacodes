//3.Write a program to implement following hierarchy

import java.util.Scanner;

class student
{
	int Rollno,m1,m2;
	String name;
	int total;
	Scanner sc=new Scanner(System.in);
}
class test extends student
{
	void getdata()
	{
		System.out.println("\n**********************************");
		System.out.print("Enter Roll No. : ");
		Rollno=sc.nextInt();	
		System.out.print("Enter Name : ");
		name=sc.next();
		System.out.print("Enter marks 1 : ");
		m1=sc.nextInt();
		System.out.print("Enter marks 2 : ");
		m2=sc.nextInt();
	}
}
interface Marks	
{
	int sportwt=5;
}
class hierarchy extends test implements Marks
{
	void display()
	{
		total=m1+m2+sportwt;
		System.out.println("Sport wt = "+sportwt);
		System.out.println("Total : "+total);
		System.out.print("**********************************\n");
	}
	public static void main(String args[])
	{
		hierarchy h=new hierarchy();
		h.getdata();
		h.display();
	}
}