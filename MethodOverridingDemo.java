class Shape
{
   void draw()
{
    System.out.println("Drawing Shapes");
}
}
class Circle extends Shape
{
void draw()
{
System.out.println("Drawing Circle");
}
}
public class MethodOverriding
{
public static void main(String args[])
{
	Shape obj1=new Circle();
	//Circle obj1=new Shape();
	obj1.draw();
}
}
