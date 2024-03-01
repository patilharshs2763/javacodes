//4.wap to calculate simple interest using keyword final.

import java.util.Scanner;

class cal_intrest
	{
	Scanner sc=new Scanner(System.in);
	final int rate=8;
	double principal,period,simple_intrest,payable_amount;
	
	void getdata()
	{
	System.out.println("\n----------------------Simple Interst Calculation----------------------\n");
	System.out.print("Enter your Principal : ");
	principal=sc.nextDouble();
	System.out.print("Enter your period : ");
	period=sc.nextDouble();
	System.out.println("Final Rate is : "+rate);
	}
	
	void showdata()
	{
	simple_intrest=principal*rate*period/100;
	payable_amount=simple_intrest+principal;
	System.out.println("Your intrest is : "+simple_intrest);
	System.out.println("Payable amount is : "+payable_amount);
	System.out.println("\n----------------------------------------------------------------------\n");	
	}
	public static void main(String args[])
	{
	cal_intrest obj=new cal_intrest();
	obj.getdata();
	obj.showdata();
	}
}
