class StudentTest
{
	String name;
	int age;
	
	void Student(String n,int a)
	{
		name=n;
		age=a;
	}
	void printDetails()
	{
		System.out.println("My name is "+name+" and my age is "+ age);
	}
	public static void main(String [] args)
	{
	    StudentTest s = new StudentTest();
        StudentTest s2 = new StudentTest();
		s.Student("John", 25);
		s2.Student("Julie",20);

        s.printDetails();
        s2.printDetails();
    }
}