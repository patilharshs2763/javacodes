public class OuterClass
{
	public void displayout()
	{
		class inner
		{
			void displayin()
			{
				System.out.println("\nThis is inner class");
			}
		}
		System.out.println("\nThis is outer class");
		inner obj2 = new inner();
		obj2.displayin();
	}
	public static void main(String[] args)
	{
		OuterClass obj1 = new OuterClass();
		obj1.displayout();
	}
}