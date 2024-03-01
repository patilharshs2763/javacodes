/*8.Develop a class personal details.it should have fields name,height (in inches) and weight(in
pounds).convert the height to cenimeters and weight to kilograms and display the result. (1
inch=2.54cm) and (1 pound=0.4546kg). */

import java.util.Scanner;
class personal_detail
{
	Scanner sc=new Scanner(System.in);
	double height1; 
	double weight1;
	int height;
	String name;
	int weight;
	void getdata()
	{
	System.out.println("\n**************************************************************");
	System.out.print("Enter Your name : ");
	name=sc.next();
	System.out.print("Enter height(in inches) : ");
	height=sc.nextInt();
	System.out.print("Enter weight (in pound) : ");
	weight=sc.nextInt();
	
	}
	void showdata()
	{
	System.out.println("----------------------------------------------------------------");
	height1=height*(2.54);
	weight1=weight*(0.4546);
	System.out.println("Your Name is = "+name);
	System.out.println("Coverted height from inches to centimeter="+height1);
	System.out.println("Converted weight from pounds to kg="+weight1);
	System.out.println("**************************************************************");
	}

	public static void main (String args[])
	{
	personal_detail obj=new personal_detail();
	obj.getdata();
	obj.showdata();
	}
}

