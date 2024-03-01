/*4.Write a program to create a class Employee having data member as Name and basic salary.Accept and display data for one object. */

import java.util.Scanner;
class Employee
{
	String name;
	double sal;
	
	void getdata()
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Name of Employee :");
	name = sc.next();
	System.out.print("Enter Salary of Employee :");
	sal = sc.nextDouble();
	}
	void display()
	{
	System.out.println("\n*********************************\n");
	System.out.println("Name of the Employee : "+name);
	System.out.println("-----------------------------------");
	System.out.println("Salary of the Employee : "+sal);
	System.out.println("\n************************************");
	}
	public static void main(String[] args)
	{
	Employee e1 = new Employee();
	e1.getdata();
	e1.display();
	}
}
