import java.util.Scanner;

class NestedIfAge
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Age:");
		int age=sc.nextInt();
		
		if(age>0)
		{
			System.out.println("\nWelcome!!!!");
			if(age>18)
			{
				System.out.println("You can Vote....!");
			}
			else
			{
				System.out.println("But you cann't Vote....!");
			}
		}
		else
		{
			System.out.println("Enter valid age!");
		}
	}
}