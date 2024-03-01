class Stud{
	int rollno;
	String name;
	
	void insertRecord(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void displayInfo()
	{
		System.out.println(rollno+" "+name);
	}
	public static void main(String [] args)
	{
		Stud s=new Stud();
		Stud s2=new Stud();
		s.insertRecord(100,"Harsh");
		s2.insertRecord(101,"Shweta");
		s.displayInfo();
		s2.displayInfo();
	}
}