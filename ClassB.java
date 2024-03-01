abstract class ClassA
{
  final int a=10;
 abstract void callme();
 void display()
 {
 }
 final void display1()
 {
 }
}
class ClassB extends ClassA
{
void callme()
{
System.out.println("this is call me inside child.");
}
public static void main(String[] args)
{
ClassB b = new ClassB();
b.callme();
}
}
