//Java code for using 'this' keyword to refer current class instance variables 
class thisDemo1
{
	int a; 
	int b;
	
	thisDemo1(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	void display()
	{
		System.out.println("a = " + a); 
		System.out.println("b = " + b);
	}
		public static void main(String[] args)
		{
			thisDemo1 obj = new thisDemo1(10, 20); 
			obj.display();
		}
}
