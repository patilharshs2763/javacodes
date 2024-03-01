import java.util.Scanner;  
public class Sum_Digit   
{
	public static void main(String args[])
	{
		int no,d,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");  
		no=sc.nextInt();  
		while(no>0)  
		{  
			d=no%10;   //finds the last digit of the given number
			sum=sum+d;  //adds last digit to the variable sum  
			no=no/10;  //removes the last digit from the number
		}
		System.out.println("Sum of Digits: "+sum);  //prints the result
	}  
}