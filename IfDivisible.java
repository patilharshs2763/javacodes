import java.util.Scanner;
public class IfDivisible
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number: ");
		int No = sc.nextInt();
			if((No%5)== 0)
			{
			System.out.print( "Given number s Divisible by 5." );
			}
	}
}