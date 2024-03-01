//User-Defined package

package harshnew;
class UserDefinedP11
{

	public void show()
	{
		System.out.println("Hiii Harsh...!");
	}
}


class UserDefinedP22 extends UserDefinedP11{

	public static void main(String[] args)
	{
		UserDefinedP22 p=new UserDefinedP22();
		p.show();
	}
}