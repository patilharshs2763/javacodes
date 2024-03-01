//3.wap for inheriting constructor using super keyword

class car
{
	String brand = "MG";
	String MODEL = "MG Hector";
	String Variant = "Sharp";
	double price=1500000;
	car()
	{
		System.out.println("\n******************");
	}
	void brand()
	{
		System.out.println("\nCars Brand : "+brand);
	}
	void MODEL()
	{
		System.out.println("Model is : "+MODEL);
	}
	void Variant()
	{
		System.out.println("Variant is : "+Variant);
	}
	void price()
	{
		System.out.println("Price : "+price);
	}
	}
class suv extends car
{
	String brand = "Kia";
	String MODEL = "Seltos";
	String Variant = "GTX";
	double price=1800000;

	void brand()
	{
		System.out.println("\nCars Brand : "+brand);
	}
	void MODEL()
	{
		System.out.println("Model is : "+MODEL);
	}
	void Variant()
	{
		System.out.println("Variant is : "+Variant);
	}
	void price()
	{
		System.out.println("Price : "+price);
	}
	void details()
	{
		super.brand();
		super.MODEL();
		super.Variant();
		super.price();
		brand();
		MODEL();
		Variant();
		price();
		System.out.println("\n******************");
	}
}
public class Super_Inherit
{
	public static void main(String[] args)
	{
		suv s = new suv();
		s.details();
	}
}
