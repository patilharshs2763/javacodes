import java.util.Scanner;

class student
{
	int rno;
	String name;
	Scanner sc=new Scanner(System.in);
	static String C_name="GpK";
	
	student(int r, String n)
	{
		rno=r;
		name=n;
	}
	void getdata()
	{
	 System.out.println("\nRoll No:"+rno);
	 rno=sc.nextInt();
	 System.out.println("Name:"+name);
	 name=sc.next();
	 
	}
	
	void show()
	{
		System.out.println("\nRoll No:"+rno);
		System.out.println("Name:"+name);
		System.out.println("College Name:"+C_name);
	
	}
	
}
class StaticVariableEx2
{
	public static void main(String [] args)
	{
		student s1=new student(0,a);
		student s2=new student(1,b);
		
		s1.getdata();
		s2.getdata();
		
		s1.show();
		s2.show();
	}
}