import java.util.Scanner;

class modex
{
	public static void main (String[] args)
	{
		int num,num2,res;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		num= sc.nextInt();
		System.out.print("Enter Number : ");
		num2= sc.nextInt();
		
		res=num%num2;
		
		System.out.print("Modulo is: "+res);
	}
}