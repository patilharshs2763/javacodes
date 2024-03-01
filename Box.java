/*a. Create a class „Rectangle‟ that contains „length‟ and „width‟ as data members.
From this class drive class box which has additional data member „depth‟.
Class „Rectangle‟ consists of a constructor and an area ( ) function.
The derived „Box‟ class have a constructor and override function named area ( ) which returns surface area of „Box‟ and a volume ( ) function.
Write a java program calling all the member function.*/

import java.io.*;
class Rectangle
{
	int length, width; 
	Rectangle(int length, int width)
	{
		this.length= length; 
		this.width=width;
	} 
	int area()
	{
		return length*width;
	}
}
class Box extends Rectangle
{
	int depth;
	Box (int length, int width, int depth)
	{
		super(length, width);
		this.depth =depth;
	}
	int area()
	{
		return 2*(length*width+width*depth+depth *length);
	}
	int volume(int l, int w, int d)
	{
		return l*w*d;
	}
	public static void main(String args[])
	{
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.print("\nEnter the length : ");
			int l= Integer.parseInt(bin.readLine());
			System.out.print("Enter the width : ");
			int w= Integer.parseInt(bin.readLine());
			System.out.print("Enter the depth : ");
			int h= Integer.parseInt(bin.readLine());
			Box b= new Box(l,w,h);
			Rectangle r= new Rectangle(l,w);
			System.out.println("-----------------------------------------");
			System.out.println("Area of the Rectangle is:"+r.area());
			System.out.println("Area of the Box is:"+b.area());
			System.out.println("volume of the Rectangle is "+b.volume(l,w,h));
		}
		catch(Exception e)
		{
			System.out.println("Exception caught"+e);
		}
	}
}