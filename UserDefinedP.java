//User-Defined package

package harsh;

public class UserDefinedP
/*
{
	private void show()	//private member
	{
		System.out.println("Hiii Harsh...!");
	}
	public static void main(String[] args)
	{
		UserDefinedP p=new UserDefinedP();
		p.show();
	}
}
*/
//Default member 
{

	void show()						//within class and within package
	{
		System.out.println("Hiii Harsh...!");
	}
}
class UserDefinedP2{
	public static void main(String[] args)
	{
		UserDefinedP p=new UserDefinedP();
		p.show();
	}
}

/*
//Protected member

{

	protected void show()
	{
		System.out.println("Hiii Harsh...!");
	}
}


class UserDefinedP2 extends UserDefinedP{
	public static void main(String[] args)
	{
		UserDefinedP2 p=new UserDefinedP2();
		p.show();
	}
}

//for public member
{

	public void show()
	{
		System.out.println("Hiii Harsh...!");
	}
}*/