import java.util.*;
interface gross
{ 
	//float ta,da;
	void gross_sal();
}
	class employee
	{
		String name;
		float basic_sal;
		Scanner sr = new Scanner(System.in);
		void input()
		{
			System.out.println("Please Enter Your Name :- ");
			name = sr.nextLine();
			System.out.println("Please Enter Your Basic Salary :- ");
			basic_sal = sr.nextInt();
		}
}
class Salary extends employee implements gross
	{
	float ta,da;
	double hra;
	public void gross_sal()
	{
	ta= basic_sal*3;
	da= basic_sal/30;
	hra= basic_sal*0.20;
	basic_sal+=ta+da+hra;
	}
	void disp_sal()
	{
	System.out.println("Name : "+name);
	System.out.println("Total Allowance : "+ta);
	System.out.println("Daily allowance : "+da);
	System.out.println("House Rent Allowance is : "+hra);
	}
	public static void main(String args[])
	{
	Salary obj = new Salary();
	obj.input();
	obj.gross_sal();
	obj.disp_sal();
	}
}
