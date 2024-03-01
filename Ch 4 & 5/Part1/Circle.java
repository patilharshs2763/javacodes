/*8.Write a program to create a package named mypack and
import it in circle class. code 2 : */

import mypack.*; 
import java.util.*; 
class Circle
{
	public static void main (String args[])
	{
		Circle_Area a=new Circle_Area();
		Scanner sc=new Scanner(System.in);
		System.out.print( "Enter radius of circle : " );
		double radius=sc.nextDouble();
		double area;
		System.out.print("The area of circle : "+a.area(radius));
	}
}
