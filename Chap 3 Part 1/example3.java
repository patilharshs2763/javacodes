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
		System.out.print("Enter Roll No. : ");
		Rollno=sc.nextInt();	
		System.out.print("Enter Name : ");
		name=sc.next();
		System.out.print("Enter m1 : ");
		m1=sc.nextInt();
		System.out.print("Enter m2 : ");
		m2=sc.nextInt();
	}
}
interface Marks
{
	int sportwt=5;
}
class print extends test implements Marks
{
	void display()
	{
		total=m1+m2+sportwt;
		System.out.print("Sport wt = "+sportwt);
		System.out.print("Total : "+total);
	}
	public static void main(String args[])
	{
		print p=new print();
		p.getdata();
		p.display();
	}
}