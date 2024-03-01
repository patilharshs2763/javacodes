//2.Define a class shape having overloaded static member Function area to calculate & display area of Square & Rectangle.public class shapearea
class shapearea
{
	public static int rect_area(int length)
	{
	return length * length;
	}
	public static int rect_area(int length, int breadth)
	{
	return length * breadth;
	}
	public static void main(String[] args)
	{
	int side = 50;
	int length = 40;
	int breadth = 30;
	System.out.println("\n----------------- Area Calculation -----------------");
	System.out.println("\nArea of Square whose "+side+" is ="+shapearea.rect_area(side));
	System.out.println("Area of Rectangle for length "+length+" and breadth "+breadth+" is = "+shapearea.rect_area(length,breadth));
	System.out.println("\n----------------------------------------------------");
	}
}
