import java.util.Scanner;
public class IfElsePositive
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int a = sc.nextInt();
			if(a>0)
				{
					System.out.print( "Given number is Positive!!" );
				}
			else
				{
					System.out.print( "Given number is Negative!!" );
				}
	}
}