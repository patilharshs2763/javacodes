/*Create a class with 3 data members. 
Define parameterized constructor to set values of first two data members. 
Define a method to calculate addition of numbers and print the result.
Harshvardhan S Patil (196037)*/

//7.wap for parameterised constructor

import java.util.Scanner;

class paraconstructor
{
	Scanner sc=new Scanner(System.in);
	int fno,sno;
	int sum;
	//Scanner sc=new Scanner(System.in);
	paraconstructor(int f,int s)
	{
		fno=f;
		sno=s;
	}
	void getdata()
	{
		System.out.println("Enter First No:");
		fno=sc.nextInt();
		System.out.println("Enter Second No:");
		sno=sc.nextInt();
	}
	void showdata()
	{
		sum=fno+sno;
		System.out.println("Addition is:"+sum);
		
	}
	public static void main(String[] args)
	{
		paraconstructor ab = new paraconstructor(0,0);
		ab.getdata();
		ab.showdata();
	}
}
