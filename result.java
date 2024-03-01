//b.Write an applet program that accepts two input, strings using tag and concatenate the strings and display it in status Window.
import java.io.*; 
class Student 
{
	String name;
	int roll_no; 
	double m1, m2; 
	Student(String name, int roll_no, double m1, double m2) 
	{
	this.name = name;
	this.roll_no = roll_no;
	this.m1 = m1;
	this.m2 = m2;
	} 
}
interface exam
{
	public void per_cal();
}
class result extends Student implements exam
{
	double per;
	result(String n, int r, double m1, double m2)
	{
		super(n,r,m1,m2);
	}
	public void per_cal()
	{			
		per = ((m1+m2)/200)*100;
		System.out.println("Percentage is "+per);
	}
	void display()
	{
		System.out.println("-----------------------------------------");
		System.out.println("The name of the student is : "+name); 
		System.out.println("The roll no of the student is : "+roll_no);
		per_cal();
	}
	public static void main(String args[]) 
	{
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.print("\nEnter name : ");
			String n = bin.readLine();
			System.out.print("\nEnter roll no : ");
			int rn = Integer.parseInt(bin.readLine());
			System.out.print("\nEnter mark1 : ");
			double m1 = Double.parseDouble(bin.readLine());
			System.out.print("\nEnter mark 2 : ");
			double m2 = Double.parseDouble(bin.readLine());
			result r = new result(n,rn,m1,m2);
			r.display(); 
		}
		catch(Exception e)
		{
			System.out.println("Exception caught"+e);
		}
	}
}