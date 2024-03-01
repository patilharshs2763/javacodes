//6.Write a program to count the number of vowel characters in a string.


import java.util.Scanner;
public class Vowels
{
	public static void main(String args[])
	{
		int count = 0;
		String a;
		Scanner sc = new Scanner(System.in);
		System.out.println("*************************************");
		System.out.print("Enter a sentence :");
		a = sc.next();
		for (int i=0 ; i<a.length(); i++)
			{
				char ch = a.charAt(i);
				if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' ')
				{
					count ++;
				}
			}
		System.out.println("Total count of Vowel in sentence : "+count);
		System.out.print("*************************************");
	}
}