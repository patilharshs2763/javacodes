/*
2. Implementing “Multiple inheritance”. 
Create a two interface Account containing methods set() and display() And interface Person containg methods store() and disp().
Derive a class Customer from Person and Account. 
Accept the name, account number ,balance and display all the information related to account along with the interest.
*/
import java.util.Scanner;
interface account
{
	void set();
	void display();
}
interface person
{
	void store();
	void disp();
}
class customer implements account,person
{
	String name;
	long acc_no;
	float balance;
	public void set()
	{
		//double balance;
		
		double rate=(double)balance*0.07;
		balance+=rate;
	}
	public void display()
	{
		System.out.println("Total balance with interest : "+balance);
		System.out.println("**************************************");
	}
	public void store()
	{
		customer c=new customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n**************************************");
		System.out.print("Enter your Name : ");
		name=sc.next();
		System.out.print("Enter your Account No : ");
		acc_no=sc.nextLong();
		System.out.print("Enter your Balance : ");
		balance=sc.nextFloat();
		System.out.println("**************************************");
	}
	public void disp()
	{
		System.out.println("Name of Account Holder : "+name);
		System.out.println("Account number of Account Holder : "+acc_no);
	}
	public static void main(String args[])
	{
		customer c1=new customer();
		c1.store();
		c1.set();
		c1.disp();
		c1.display();
	}
}
