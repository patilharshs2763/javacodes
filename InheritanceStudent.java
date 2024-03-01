/*Create class student having method getdata() 
which should accept details of students such as rno, name, and marks of three subject.
Extend the class sport from student. Define method getsports() to accept marks of sports.
Extend the class result from sports .
Define method cal() in result to calculate the total and average of marks & display it.
Harshvardhan S Patil(196037)*/

import java.util.*;
class Student
{
	int rno;
	String Name;
	double java,nad,php,total,avg;
	
	
	void getdata()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("\nEnter your RollNo:");
		rno=sc.nextInt();
		System.out.print("Enter your Name:");
		Name=sc.next();
		System.out.print("\nEnter marks for Java:");
		java=sc.nextDouble();
		System.out.print("Enter marks for NAD:");
		nad=sc.nextDouble();
		System.out.print("Enter marks for PHP:");
		php=sc.nextDouble();
		
	}
}
	class sport extends Student
	{
		double sprt;
		
		void getsports()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("\nEnter your Sports Mark:");
		sprt=sc.nextDouble();
	}
	}
	
	class result extends sport
	{
	void cal()
	{
		//double total,avg;
		total=java+nad+php+sprt;
		avg=total/4;
		System.out.println("*********************************************");
		System.out.println("\nRoll no:"+rno);
		System.out.println("Name:"+Name);
		System.out.println("Total Marks:"+total);
		System.out.println("Avg:"+avg);
	}
	}
	class InheritanceStudent
	{
		public static void main(String[] args)
		{
			result r=new result();
			r.getdata();
			r.getsports();
			r.cal();
		}
	}