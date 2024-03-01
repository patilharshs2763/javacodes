import java.util.Scanner;
public class JavaMethodsExample
{

	int sNo;
	String name;
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

	public static void main(String[] args)
	{

	JavaMethodsExample obj = new JavaMethodsExample();
	obj.readData();
	obj.showData();

	}

}