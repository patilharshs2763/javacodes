//5.Write a program to implement following hierarchy.
import java.util.*;
interface Marks	
{
	int sportwt=5;
}
class student
{
	int Rollno;
	int total;
	String name;	
	Scanner sc=new Scanner(System.in);
	
	void cal()
	{
		System.out.println("\n**********************************");
		System.out.print("Enter Roll No. : ");
		Rollno=sc.nextInt();	
		System.out.print("Enter Name : ");
		name=sc.next();
		System.out.print("Enter total marks : ");
		total=sc.nextInt();
	}
}
class print extends student implements Marks
{
	void disp()
	{
		total+=sportwt;
		System.out.println("\n**********************************");
		System.out.println("Your Name : "+name);	
		System.out.println("Your Roll no : "+Rollno);
		System.out.println("Your Total marks : "+total);
		System.out.println("**********************************");
	}
	public static void main(String args[])
	{
		print s=new print();
		s.cal();
		s.disp();
	}
}