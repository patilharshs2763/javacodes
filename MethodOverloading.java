import java.util.Scanner;
public class MethodOverloading
{

	int sNo;
	int SNO;
	String name;
	String NAME;
	Scanner read = new Scanner(System.in); 
	
	void readData()
	{
		System.out.print("Enter Roll Number:"); 
		sNo = read.nextInt();
		System.out.print("Enter the Name: ");
		name = read.next();
	}
	void showData()
	{
	System.out.println("Hello, " + name + "! your Roll number is " + sNo);
	}
	void readData()
	{
		System.out.print("Enter Roll Number:"); 
		SNO =read.nextInt();
		System.out.print("Enter the Name: ");
		NAME =read.next();
	}

	public static void main(String[] args)
	{

	MethodOverloading obj = new MethodOverloading();
	obj.readData();
	onj.readData();
	obj.showData();
	obj.showData();

	}

}