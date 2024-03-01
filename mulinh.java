class A
{
 void display()
 {
   System.out.println("Class A method");
  }
} 
class B extends A
{
 void display1()
 {
   System.out.println("Class B method");
   
  }
} 
class C extends B
{
 void display2()
 {
   System.out.println("Class C method");
   
  }
} 
class mulinh
{
public static void main(String args[])  
{
  C obj1=new C();
  obj1.display();
  obj1.display1();
  obj1.display2();
  }
  }
