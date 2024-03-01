//7.wap for parameterised constructor

import java.util.Scanner;

class paraconstructor
{
	Scanner sc=new Scanner(System.in);
	int fno,sno;
	int sum;

	paraconstructor(int f,int s)
	{
		fno=f;
		sno=s;
	}
	void getdata()
	{
		System.out.println("\n---------- Parameterized Constructor ----------\n");
		System.out.print("\nEnter First No:");
		fno=sc.nextInt();
		System.out.print("Enter Second No:");
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