import java.lang.*;
import java.io.*;
class Item
{
	String codename;
	int code;
	int price;
	void getdata() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter CodeName:");
		codename = br.readLine();
		
		System.out.println("Enter code:");
		code = Integer.parseInt(br.readLine());
		
		System.out.println("Enter price:");
		price = Integer.parseInt(br.readLine());
		
	}
	void show()
	{
		System.out.println("CodeName:"+codename);
		System.out.println("Code:"+code);
		System.out.println("Price:"+price);
		
	}
}
class Number
{
	public static void main(String[] args) throws IOException
	{
		Item i=new Item();
		i.getdata();
		i.show();
	}
}