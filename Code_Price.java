//Define a class item having data member code & price .
//Accept for one object & display it
//Harshvardhan S Patil (196037)

import java.util.*;

class Item
{
	int code;
	int price;
	Scanner sc=new Scanner(System.in);
	void getdata() 
	{
		System.out.println("Enter product code:");
		code=sc.nextInt();
		
		System.out.println("Enter product price:");
		price=sc.nextInt();
	}
	void show()
	{
		
		System.out.println("Code:"+code);
		System.out.println("Price:"+price);
		
	}
}
class Code_Price
{
	public static void main(String[] args) 
	{
		Item i=new Item();
		i.getdata();
		i.show();
	}
}