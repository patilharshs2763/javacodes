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
class C extends A
{
 void display2()
 {
   System.out.println("Class C method");
   
  }
} 
class mulinh1
{
public static void main(String args[])  
{
  C obj1=new C();
  B obj2=new B();
  obj1.display();
  obj2.display1();
  obj1.display2();
  }
  }