import java.util.*;
class Student1
{
	int rno;
	String Name;
	double java,nad,php,total,avg;
	Scanner sc= new Scanner(System.in);
	
	void getdata()
	{
		System.out.println("Enter your name,rno,name and marks of java,nad and php:");
		rno=sc.nextInt();
		Name=sc.next();
		java=sc.nextDouble();
		nad=sc.nextDouble();
		php=sc.nextDouble();
		
	}
}
	class res extends Student1
	{
	void cal()
	{
		total=java+nad+php;
		avg=total/3;
		System.out.println("Roll no:"+rno);
		System.out.println("Name:"+Name);
		System.out.println("Total Marks:"+total);
		System.out.println("Avg:"+avg);
	}
	}
	class SingleInhe
	{
		public static void main(String[] args)
		{
			res r=new res();
			r.getdata();
			r.cal();
		}
	}
