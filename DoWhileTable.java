import java.util.Scanner;
class DoWhileTable
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number: ");
		int no = sc.nextInt();
		int a=1;
		System.out.println("Table of "+no);
		do
		{
			System.out.println("" +no*a);
			a++;
		}
		while (a <= 10);
	}
}