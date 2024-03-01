/*3.Create a Shape interface having methods area () and perimeter ().
Create 2 subclasses, Circle and Rectangle that implement the Shape interface.
Create a class Sample with main method and demonstrate the area and perimeters of both the shape classes*/

import java.util.Scanner;
interface Shape
{
	final float PI=3.14f;
	float Area(float a,float b);
	float perimeter(float a,float b);
}
class Circle implements Shape
{
	public float Area(float a,float b)
	{
		return (PI*a*a);
	}
	public float perimeter(float a,float b)
	{
		return (2*PI*a);
	}
}
class Rectangle implements Shape
{
	public float Area(float a, float b)
	{
		return (a*b);
	}
	public float perimeter(float a, float b)
	{
		return (2*a+2*b);
	}
}
class Sample
{
	public static void main(String args[])
	{
		Sample s=new Sample();
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Shape shap;
		shap=c;
		System.out.println("\n**************************************");
		System.out.println("The Area of Circle : "+shap.Area(10,0));
		System.out.println("The Perimeter of Circle : "+shap.perimeter(10,0));
		shap=r;
		System.out.println("The Area of Rectangle : "+shap.Area(20,30));
		System.out.println("The Perimeter of Rectangle : "+shap.perimeter(20,30));
		System.out.println("\n**************************************");
	}
}