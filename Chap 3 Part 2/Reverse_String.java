//7.Write a program to string in reverse order.
import java.util.*;
public class Reverse_String
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n**************************************");
		System.out.print("Enter String : ");
		String str =sc.next();
		String rstr = "";
		for(int i = str.length()-1; i >= 0; i--)
		{
			rstr = rstr + str.charAt(i);
		}
		System.out.println("\nOriginal string: " + str);
		System.out.println("Reverse of given string: " + rstr);
		System.out.println("**************************************");
	}
}