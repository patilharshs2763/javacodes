//4.wap to calculate simple interest using keyword final.

import java.util.Scanner;

class final_intrest
	{
	Scanner sc=new Scanner(System.in);
	final int rate=8;
	double principal,period,simple_intrest,payable_amount;
	
	void getdata()
	{
	System.out.print("Enter your Principal : ");
	principal=sc.nextDouble();
	System.out.print("Enter your period : ");
	period=sc.nextDouble();
	}
	
	void showdata()
	{
	simple_intrest=principal*rate*period/100;
	payable_amount=simple_intrest+principal;
	System.out.println("Your intrest is : "+simple_intrest);
	System.out.println("Payable amount is : "+payable_amount);
	}
	
	}
	class cal_intrest
	{
	public static void main(String args[])
	{
	final_intrest obj=new final_intrest();
	obj.getdata();
	obj.showdata();
	}
}