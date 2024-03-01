class Class1
{
public void display()
{
System.out.println("Display method inside Class1.");
}
}
class Class2
{
public void display()
{
System.out.println("Display method inside Class2.");
}
}
public class Multiple extends Class1, Class2
{
public static void main(String args[])
{
Multiple obj = new Multiple();
//Ambiguity problem in method call which class display() method will be called.
obj.display();
}
}