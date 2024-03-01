class ImplicitTypeCasting
{
	public static void main(String args[])
	{
	int a=10;
	//automatically converts the integer type into long type 
	long z=a;
	//automatically converts the long type into float type
	float y=z;
	
	System.out.println("Before Conversion,the value is		"+a);
	System.out.println("After conversion,the long value is	"+z);
	System.out.println("After Conversion,the float value is	"+y);
	}
}