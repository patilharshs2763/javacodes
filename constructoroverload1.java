// example of constructor overloading

class constructoroverload1
{
	String name;
	int rno;
	int year;
	
	constructoroverload1(String n,int r)
		{
			name=n;
			rno=r;
		}
	constructoroverload1(String n,int r,int y)
		{
			name=n;
			rno=r;
			year=y;
		}
	void show()
	{
		System.out.println("Roll No:"+rno+" Name: "+name+" Year: "+year);
	}
	public static void main(String[] args)
	{
		constructoroverload1 obj1=new constructoroverload1("Harsh",10);
		constructoroverload1 obj2=new constructoroverload1("Harsh",11);
		constructoroverload1 obj3=new constructoroverload1("Vyanki",10,2003);
		obj1.show();
		obj2.show();
		obj3.show();
	}
}