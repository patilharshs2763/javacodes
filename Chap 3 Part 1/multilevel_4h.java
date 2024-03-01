//1.Write a java program to implement multilevel inheritance with 4 levels of hierarchy

class Continent
{
	void con()
	{
		System.out.println(" Continent name : Asia. ");
	}
}
class Country extends Continent
{
	void coun()
	{
		System.out.println(" Country name : India. " );
	}
}
class State extends Country
{
	void stat()
	{
		System.out.println(" State name : Maharashtra. ");
	}
}
class District extends State
{
	void dist()
	{
		System.out.println(" District name : Kolhapur ");
	}
}
public class multilevel_4h
{
	public static void main(String args[])
	{
		System.out.println("\n**************************************");
		System.out.println("\nMy Location :\n");
		District d = new District();
		d.con();
		d.coun();
		d.stat();
		d.dist();
		System.out.println("**************************************");
	}
}

