/*5.Write a program to create a class Student having data member as Name,roll-no and percentage.
Accept  data for five object and display the merit list containing merit number,rollnumber and percentage by using array of object.*/

import java.io.*;
import java.util.Scanner;
class Student
{
	String name;
	int rno;
	int marks;
	
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter Name :");
		name=sc.next();
		System.out.print("Enter Rollno :");
		rno=sc.nextInt();
		System.out.print("Enter Marks :");
		marks=sc.nextInt();
	}
	void display()
	{
		System.out.println("\nRollno : "+rno);
		System.out.println("Name : "+name);
		System.out.println("Marks : "+marks);
	}
	
	public static void main(String args[])
	{
		System.out.println("\n------------------------------------");
		Student st[] = new Student[5];
		for (int i=0;i<5;i++) {
		st[i] = new Student();
		st[i].getdata();
	}
		int n = st.length;
		for(int i=1;i<5;i++)
		{
		for(int j=0;j<n-1;j++)
		{
		if(st[j].marks<st[j+1].marks)
		{
		Student tmp = st[j];
		st[j] = st[j+1];
		st[j+1] = tmp;
		}
		}
		}
		for(int i=0;i<5;i++)
		{
		System.out.println("\n------------------------------------");
		System.out.println("\nMerit "+(i+1)+" ");
		st[i].display();
		System.out.println("\n------------------------------------");
	}
	}
}