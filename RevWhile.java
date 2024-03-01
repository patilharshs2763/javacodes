//Define a class having one 3 digit number as  a data member 
//& display reverse of that number
//Harshvardhan S Patil (196037)


import java.util.Scanner;
class RevWhile
{
	public static void main(String[] args)
	
	{
		Scanner sc=new Scanner(System.in);
		int rev=0;
		System.out.println("Enter your No:");
		int n=sc.nextInt();
		System.out.println("Entered no:"+n);
		while(n>0)
		{
			rev=(rev*10)+n%10;
			n=n/10;
		}
		System.out.println("Revesred no:"+rev);
	}
}