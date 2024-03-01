/*7. Write a program to implement the following inheritance.Assume suitable
methods*/

import java.util.Scanner;
class Student1
{
	int r_no;
	String name;
	String dept;
	void read1() 
	{
	Scanner sc1 = new Scanner(System.in);
	System.out.println("\nEnter Student Roll no :");
	r_no=sc1.nextInt();
	System.out.println("Enter Student Name :");
	name = sc1.next();
	System.out.println("Enter Student Department :");
	dept = sc1.next();
	}
	void show1() 
	{
	System.out.println("\n************ Student Information ************");
	System.out.println("Roll no : "+r_no);
	System.out.println("name : "+name);
	System.out.println("Department of : "+dept);
	System.out.println("-------------------------------------------");
	}
	}
	class library extends Student1
	{
	int member_no;
	String member_city;
	String member_mail;
	void read2()
	{
	Scanner sc2 = new Scanner(System.in);
	System.out.println("\nEnter Member no :");
	member_no = sc2.nextInt();
	System.out.println("Enter Member city :");
	member_city = sc2.next();
	System.out.println("Enter Member E-mail :");
	member_mail = sc2.next();
	}
	void show2()
	{
	System.out.println("\n************ Member Information ************");
	System.out.println("Number : "+member_no);
	System.out.println("City : "+member_city);
	System.out.println("E-Mail : "+member_mail);
	System.out.println("-------------------------------------------");
	}
	}
	class inheritance
	{
	public static void main(String[] args) 
	{
	library l1 = new library();
	l1.read1();
	l1.read2();
	l1.show1();
	l1.show2();
	}
}