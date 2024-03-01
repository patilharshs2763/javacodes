import java.util.Scanner;
public class IfElseEvenOdd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int a = sc.nextInt();
			if((a % 2 ) == 0)
			{
			System.out.print( "Given number is Even!!" );
			}
			else
			{
			System.out.print( "Given number is Odd!!" );
			}
	}
}