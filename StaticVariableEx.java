//Static variable example
//Harshvardhan S Patil (196037)

class student
{
	int rno;
	String name;
	static String C_name="GpK";
	
	student(int r, String n)
	{
		rno=r;
		name=n;
	}
	
	void show()
	{
		System.out.println("\nRoll No:"+rno);
		System.out.println("Name:"+name);
		System.out.println("College Name:"+C_name);
	
	}
	
}
class StaticVariableEx
{
	public static void main(String [] args)
	{
		student s1=new student(196037,"Harsh");
		student s2=new student(196043,"Vyanki");
		
		s1.show();
		s2.show();
	}
}