//4.wap showing method overriding.

import java.util.Scanner;
class person 
{
	String name;
	int rno;
	Scanner sc=new Scanner(System.in);
	void getdata()
	{	
		System.out.println("\n*********** Enter Data ***********");	
		System.out.print("Enter Name : ");
		name=sc.next();
		System.out.print("Enter Roll No. : ");
		rno=sc.nextInt();
	}
	void show()
	{
		System.out.println("Name : "+name);
		System.out.println("Roll No. : "+rno);
	}
}
class address extends person
	{
		String city;
		String state ;
		double weight;
		void getdata()
		{
			super.getdata();
			System.out.print("Enter Weight : ");
			weight=sc.nextDouble();
			System.out.print("Enter State : ");
			state=sc.next();
			System.out.print("Enter City : ");
			city=sc.next();
		}
		void show()
		{
			System.out.println("*********** Info ***********");
			super.show();	
			System.out.println("Weight : "+weight);
			System.out.println("State : "+state);
			System.out.println("City : "+city);
			System.out.println("\n*************************************");	
		}
	}
class overriding
	{
	public static void main(String args[])
	{
	address add=new address();
	add.getdata();
	add.show();
	}
}
