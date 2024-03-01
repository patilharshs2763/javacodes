/*Create class student having method getdata() 
which should accept details of students such as rno, name, and marks of three subject. 
Extend the class result from student .
Define method cal() in result to calculate the total and average of marks & display it.
Harshvardhan S Patil(196037)*/

import java.util.*;
class Student
{
	int rno;
	String Name;
	double java,nad,php,total,avg;
	Scanner sc= new Scanner(System.in);
	
	void getdata()
	{
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
	class result extends Student
	{
	void cal()
	{
		total=java+nad+php;
		avg=total/3;
		System.out.println("*********************************************");
		System.out.println("\nRoll no:"+rno);
		System.out.println("Name:"+Name);
		System.out.println("Total Marks:"+total);
		System.out.println("Avg:"+avg);
	}
	}
	class SingleInheritanceStudent
	{
		public static void main(String[] args)
		{
			result r=new result();
			r.getdata();
			r.cal();
		}
	}
