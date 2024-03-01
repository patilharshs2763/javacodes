import java.util.*;
class person
{
	String name;
	int age;
	String emp_designation;
	int Sal;
	Scanner sc= new Scanner(System.in);
	void getdata()
	{
		System.out.println("Enter Employee name,age,Designation and Salary:");
		name=sc.next();
		age=sc.nextInt();
		emp_designation=sc.next();
		Sal=sc.nextInt();
	}
}
class employee extends person
{
	void show()
	{
		System.out.println("Employee Name:"+name);
		System.out.println("Employee age:"+age);
		System.out.println("Designation:"+emp_designation);
		System.out.println("Salary:"+Sal);
	}
}
class PersonSingleInh
{
	public static void main(String[] args)
	{
		employee emp=new employee();
		emp.getdata();
		emp.show();
	}
}