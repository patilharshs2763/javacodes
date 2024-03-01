class Bank
{
   void show()
{
    System.out.println("Name of Bank.");
}
}
class SBI extends Bank
{
void show()
{
System.out.println("Bank is SBI...");
}
}
public class MethodOverriding
{
public static void main(String args[])
{
	SBI obj1=new SBI();
	Bank obj2=new Bank();
	obj2.show();
	obj1.show();
}
}
