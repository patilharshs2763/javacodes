//1.wap that s replace the letter a and s.

import java.util.*;
class Replace_Letter
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String : ");
		String str =sc.next();
		String str2 = str.replace('a','s');
		System.out.println("\nOriginal string: "+str);
		System.out.println("\nNew String: " +str2);
	}
}
