//b.StaticMethod

class Employee
{
	int id;
	String pos_name;
	static String company;

	static void statm()
	{
		company="DSC";
	}
	Employee(int i,String n)
	{
		id=i;
		pos_name=n;
	}
	void show()
	{
		System.out.println("\nEmployee ID:"+id);
		System.out.println("Employee Name:"+pos_name);
		System.out.println("Company:"+company);
	}
}
class StaticMethod
{
	public static void main(String args[])
	{
	Employee.statm();
	Employee e1=new Employee(111,"Manager");
	Employee e2=new Employee(222,"Programer");
	e1.show();
	e2.show();
	
	}
}