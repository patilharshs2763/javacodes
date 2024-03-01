//User-Defined package

//private access modifier

package mypackage;

public class UserDpackage1
{
	public void show()	//private member
	{
		System.out.println("Hiii Harsh...!");
	}
	public static void main(String[] args)
	{
		UserDpackage1 p=new UserDpackage1();
		p.show();
	}
}