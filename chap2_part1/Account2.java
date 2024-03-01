/*3.Write a program to create a class Account having data members as
Acc-no,Name and balance.Accept and display data for 5 objects using
Array of Objects.*/

import java.util.Scanner;

class Account2
{
	String name;
	int acc_no;
	double balance;
	Scanner sc=new Scanner(System.in);
	void accept()
	{
		System.out.print("Enter Account No : ");
		acc_no=sc.nextInt();
		System.out.print("Enter Account Holder Name : ");
		name=sc.next();
		System.out.print("Enter Balance : ");
		balance=sc.nextDouble();
		
	}
	void display()
	{
		System.out.println("\n******** Account Details ********");
		System.out.println("\n---------------------------------");
		System.out.println("Account Number : "+acc_no);
		System.out.println("---------------------------------");
		System.out.println("Name : "+name);
		System.out.println("---------------------------------");
		System.out.println("Account Balance : "+balance);
		System.out.println("---------------------------------");
	}
	public static void main(String args[])
	{
		{
		int i;
		Account2[]s1;
		s1 = new Account2[5];
		for(i=0;i<5;i++)
		{
			s1[i]=new Account2();
		}
		for(i=0;i<5;i++)
		{
		s1[i].accept();
		s1[i].display();
		}
		}
	}
}
