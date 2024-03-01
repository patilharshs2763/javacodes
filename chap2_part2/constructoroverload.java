//7.wap showing constructor overloading
class constructoroverload
{
	String name;
	int rno;
	int year;
	constructoroverload()
	{
		System.out.println("\n---------- Constructor Overloading ----------\n");
		System.out.println("\n---------- Default Constructor ----------\n");
		System.out.println("\tStudent Details\n");
	}
	
	constructoroverload(String n,int r)
		{
			name=n;
			rno=r;
		}
	constructoroverload(String n,int r,int y)
		{
			name=n;
			rno=r;
			year=y;
		}
	void show()
	{
		System.out.println("\n---------- Parameterized Constructor ----------\n");
		System.out.println("Roll No:"+rno+" Name: "+name+" Year: "+year);
	}
	public static void main(String[] args)
	{
		constructoroverload obj1=new constructoroverload("Harsh",10);
		constructoroverload obj2=new constructoroverload("Harsh",11);
		constructoroverload obj3=new constructoroverload("Vyanki",10,2003);
		obj1.show();
		obj2.show();
		obj3.show();
	}
}