/*6.wap to implement multiple inheritance using Interface 
to find area of circle and rectangle.*/

interface rect
{
	public double calarea(double a,double b);
}
interface circ
{
	public double calarea(double a);
}
class AreaCal implements rect,circ
{
	public double calarea(double a,double b)
{
	return(a * b);
}
public double calarea(double a)
{
	return(Math.PI*a*a);
}
public static void main(String args[])
{
	rect rectarea;
	circ cirarea;
	AreaCal a1 = new AreaCal();
	rectarea=a1;
	AreaCal a2 = new AreaCal();
	cirarea=a2;
	System.out.println("\nThe area of rectangle : "+rectarea.calarea(5,20));
	System.out.println("The area of circle : "+cirarea.calarea(10));
}
}
