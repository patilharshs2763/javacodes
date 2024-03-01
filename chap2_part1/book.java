/*2.Write a program to create a class Book having data member as titile,author  and price.Accept and display data for one object. */
import java.util.Scanner;
class book
{
	String title;
	String author;
	int price;
	void getdata()
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("\n---------------------------------------\n");
	System.out.print("Enter Title of Book :");
	title = sc.next();
	System.out.print("Enter Author of Book :");
	author = sc.next();
	System.out.print("Enter Price of Book :");
	price = sc.nextInt();
	System.out.print("\n---------------------------------------\n");
	}
	void showdata()
	{
	System.out.println("\n---------------------------------------");
	System.out.println("Title of Book : "+title);
	System.out.println("\n---------------------------------------");
	System.out.println("Author of Book : "+author);
	System.out.println("\n---------------------------------------");
	System.out.println("Price of Book : "+price);
	System.out.println("\n---------------------------------------");
	}
	public static void main(String[] args)
	{
	book b= new book();
	b.getdata();
	b.showdata();
	}
}
