//3.wap showing concept of static variable and static method.
//a.Static Variable
class Student
{
	int roll_no;  
	String batch;  
	String name;
	static String College_Name="GPK";
}
class StaticVar
{
	public static void main(String args[])
	{
		Student s1=new Student();  
		
		s1.roll_no=100;  
		s1.batch="IF-2";  
		s1.name="Abhijeet R";  
		
		System.out.println("\n**************************************************************");
		System.out.println("\nStudent 1 Info:\n");
		System.out.println("Name : "+s1.name);
		System.out.println("Roll No : "+s1.roll_no);  
		System.out.println("Batch : "+s1.batch);  
		
		System.out.println("College Name : "+Student.College_Name);
		
		Student s2=new Student();  
		
		s2.roll_no=105;  
		s2.batch="IF-2";  
		s2.name="Daya"; 
		System.out.println("----------------------------------------------------------------");		
		System.out.println("\nStudent 2 Info:\n");
		System.out.println("Name : "+s2.name);
		System.out.println("Name : "+s2.roll_no);  
		System.out.println("Batch : "+s2.batch);  
		System.out.println("College_Name : "+Student.College_Name);
		System.out.println("\n**************************************************************");
	}
}
