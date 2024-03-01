import java.util.Scanner;
public class IfStatement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int No = sc.nextInt();
			if(No>5)
			{
			System.out.print( +No + " is greater than 5" );
			}
	}
}