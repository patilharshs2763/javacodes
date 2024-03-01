/*WAP to illustrate multilevel inheritance such that country is inherited from continent. 
State is inherited from country .
Display the place, state, country and continent
Harshvardhan S Patil(196037)*/

class Continent
{
	void con()
	{
		System.out.println("\nContinent is Asia....!");
	}
}
class Country extends Continent
{
	void coun()
	{
		System.out.println("\nCountry is INDIA....!");
	}
}
class State extends Country
{
	void stat()
	{
		System.out.println("\nState is Maharashtra....!");
	}
}
class MultilevelInheritance
{
	public static void main(String[] args)
	{
		State s=new State();
		s.con();
		s.coun();
		s.stat();
	}
}