/*WAP to demonstrate  to implement Hierarchical Inheritance.
Harshvardhan S Patil(196037) */

class Car
{
	void show1()
	{
		System.out.println("***************HierarchicalInheritance***************");
		System.out.println("This is car...");
	}
}
class MG extends Car
{
	void show2()
	{
		System.out.println("\tThat is MG...");
	}
}
class Kia extends Car
{
	void show3()
	{
		System.out.println("\tThat is Kia...");
	}
}
class HierarchicalInheritance
{
	public static void main(String[] args)
	{
		MG m=new MG();
		m.show1();
		m.show2();
		
		Kia k=new Kia();
		k.show1();
		k.show3();
	}
}