//outside package by sub-class

/*
package harsh2;
import harsh.UserDefinedP;

class UserDefinedP2 extends UserDefinedP{
	public static void main(String[] args)
	{
		UserDefinedP2 p=new UserDefinedP2();
		p.show();
	}
}
*/
//public member example
//outside package by sub-class

package harsh2;
import harsh.UserDefinedP; //import harsh.*;

class UserDefinedP2 {
	public static void main(String[] args)
	{
		UserDefinedP p=new UserDefinedP();
		p.show();
	}
}