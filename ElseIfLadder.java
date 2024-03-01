import java.util.Scanner;
class ElseIfLadder
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Java Marks:");
		double java=sc.nextDouble();
		System.out.print("Enter PHP Marks:");
		double php=sc.nextDouble();
		System.out.print("Enter NAD Marks:");
		double nad=sc.nextDouble();
		
		double sum;
		double Avg;
		
		sum=java+php+nad;
		Avg=sum/3;
		
		System.out.println("Average of obtained Marks:"+Avg);
		
		if(Avg>=90)
		{
			System.out.println("\nPassed with A Grade!");
		}
		else if( Avg >= 80 && Avg <90 )
		{
			System.out.println("\nPassed with B Grade!");
		}
		else if(Avg >= 70 && Avg <80 )
		{
			System.out.println("\nPassed with C Grade!");
		}
		else if(Avg >= 60 && Avg < 70 )
		{
			System.out.println("\nPassed with D Grade!");
		}
		else
		{
			System.out.println("Failed!");
		}
	}
}