/*Define a class student with 4 data members such as name, rollNo, sub1,sub2. 
Define appropriate methods to intialize and display the values of data. 
Also calculate Pecentage scored by student*/

import java.util.Scanner;
class marks
{
	String name;
	int rno;
	int sub1;
	int sub2;
	public void getdata()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Name : ");
	name =sc.next();
	System.out.println("Enter Roll no. : ");
	rno =sc.nextInt();
	System.out.println("Enter marks of Subject 1 : ");
	sub1 =sc.nextInt();
	System.out.println("Enter marks of Subject 2 : ");
	sub2 =sc.nextInt();
	}
	public void showdata()
	{
	int total;
	float percent;
	total=sub1+sub2;
	percent=total/2;
	System.out.println("\n------------- Student Progress Sheet--------------");
	System.out.println("\nName : "+name);
	System.out.println("Roll no. : "+rno);
	System.out.println("Subject 1 marks: "+sub1);
	System.out.println("Subject 2 marks : "+sub2);
	System.out.println("Total marks of 2 subjects = "+total+" out of 200");
	System.out.println("Percentage = "+percent);
	System.out.println("\n---------------------------------------------------");
	}
	public static void main(String args[])
	{
	marks m1 = new marks();
	m1.getdata();
	m1.showdata();
	}
}