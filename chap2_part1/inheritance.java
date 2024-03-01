/*7. Write a program to implement the following inheritance.Assume suitable
methods*/

import java.util.Scanner;
class Student
{
	int r_no;
	String name;
	String dept;
	void read1() 
	{
	Scanner sc1 = new Scanner(System.in);
	System.out.print("\nEnter Students Roll no :");
	r_no=sc1.nextInt();
	System.out.print("Enter Students Name :");
	name = sc1.next();
	System.out.print("Enter Students Department :");
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
	class library extends Student
	{
	int member_no;
	String member_city;
	String member_mail;
	void read2()
	{
	Scanner sc2 = new Scanner(System.in);
	System.out.print("\nEnter Member no :");
	member_no = sc2.nextInt();
	System.out.print("Enter Member city :");
	member_city = sc2.next();
	System.out.print("Enter Member E-mail :");
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
	library lib = new library();
	lib.read1();
	lib.read2();
	lib.show1();
	lib.show2();
	}
}