class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread A : i = "+i);
		}
		System.out.println("********** End of Thread A **********");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("Thread B : j = "+j);
		}
		System.out.println("********** End of Thread B **********");
	}
}
class C extends Thread
{
	public void run()
	{
		for(int k=1;k<=5;k++)
		{
			System.out.println("Thread C : k = "+k);
		}
		System.out.println("********** End of Thread C **********");
	}
}
class thread_test
{
	public static void main(String args[])
	{
		//A obja= new A();
		//B objb= new B();
		//C objc= new C();
		
		new A().start();
		new B().start();
		new C().start();
		//obja.start();
		//obja.run();
		//objb.start();
		//objb.run();
		//objc.start();
		//objc.run();
		
	}
}