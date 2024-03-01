class ExplicitTypeCasting
{
	public static void main(String args[])
	{
	double a=199.85;
	//converts the double type into long type 
	long z=(long)a;
	//converts the long type into int type
	int y=(int)z;
	
	System.out.println("Before Conversion,the double type value is ="+a);
	System.out.println("After conversion,the long value is		   ="+z);
	System.out.println("After Conversion,the int value is		   ="+y);
	}
}