//Read Data from a File
//PRe-DEfined packages

import java.io.File;
import java.io.IOException;

import java.util.Scanner;

class FileReader
{
	public static void main(String[] args)
	{
	try
	{
		File r=new File("C:\\Users\\Harshvardhan\\Desktop\\P.txt");
		Scanner sc=new Scanner(r);
		while(sc.hasNextLine())
		{
			System.out.println(sc.hasNextLine());
			System.out.println(sc.nextLine());
			System.out.println(sc.hasNextLine());
		}
	}
	catch(IOException e)
	{
		System.out.println("Exception Handled...!");
	}
	}
}