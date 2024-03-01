//12.wap that reads a string and prints its first and last character

import java.util.Scanner;
public class showchar
{
	public static void main(String[] args)
	{
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter String = ");
		str = sc.nextLine();
		char firstCh = str.charAt(0);
		System.out.println("The First Character in " + str + " = " + firstCh);
		char lastCh = str.charAt(str.length() - 1);
		System.out.println("The Last Character in " + str + " = " + lastCh);
	}
}