class exception_ex
{
	public static void main(String args[])
	{
		int a=20;
		int b=6;
		int c=6;
		int x,y;
		try
		{
			x=a/(b-c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dividing by zero");
		}
		y=a/(b+c);
		System.out.println(y);
	}
}