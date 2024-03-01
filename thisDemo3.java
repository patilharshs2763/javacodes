//Using this() to invoke current class constructor

class thisDemo3
{
	{
	int a;
	int b;
	thisDemo3()
	{
		this(10,20);
		System.out.println("Inside default constructor \n");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	thisDemo3(int a,int b)
	{
		this.a = a; 
		this.b = b;
		System.out.println("Inside parameterized constructor"); 
		
	}
	}
}
	class thisDemo3
	{
	public static void main(String[] args)
		{
			thisDemo3 object = new thisDemo3();
			
		}
	}


/*
class A{  
A(){  
this(5);  
System.out.println("hello a");  
}  
A(int x){  
System.out.println(x);  
}  
}  
class thisDemo3{  
public static void main(String args[]){  
A a=new A();  
}}*/