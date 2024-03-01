// example of constructor overloading

class constructoroverload
{
	constructoroverload(String name)
	{
		System.out.println("Constructor with one parameter (String):");
		System.out.println("Name:"+name);
	}
	constructoroverload(String name,int age)
	{
		System.out.println("Constructor with two parameter (String and int):");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
	constructoroverload(long id)
	{
		System.out.println("Constructor with one parameter (long):");
		System.out.println("Id:"+id);
	}
	public static void main(String[] args)
	{
		constructoroverload objN= new constructoroverload("harsh");
		constructoroverload objN1= new constructoroverload("Shweta",18);
		constructoroverload objN2= new constructoroverload(23960611);
	}
}