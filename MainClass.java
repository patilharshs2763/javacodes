class ParentClass
{
int num1;  ParentClass()
{
System.out.println("\nInside the ParentClass default constructor");
num1 = 10;
}
ParentClass(int value)
{
class Furniture
{
Furniture()
{
System.out.println("Furniture class Constructor");
}
}
class Chair extends Furniture
{
Chair()
{
super();
System.out.println("Chair class Constructor");
}
}
class MainClass
{
public static void main(String args[])
{
Chair d=new Chair();
d.chair();
}

