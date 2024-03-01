//5.wap to  implement single inheritance. SingleInherit

class hello
{
	String str="Hello";
}
class inherit extends hello{
	String str2="Single Inheritance";
}
class SingleInherit{
	public static void main(String args[])
	{
		System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*");
		inherit i=new inherit();
		System.out.print(""+i.str);
		System.out.println(" "+i.str2);
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*");
	}
}