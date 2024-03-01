//User-Defined package
//import from another package
package mypackage2;
import mypackage.UserDpackage2; //import harsh.*;


class UserDpackage3

{
	/*
	 void show()	//private member
	{
		System.out.println("Hiii Harsh...!");
	}*/

	
	public static void main(String[] args)
	{
		UserDpackage2 p=new UserDpackage2();
		p.show();
	}
}