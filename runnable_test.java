class test implements Runnable
{
	public void run()
	{
		System.out.println("Starting of Thread test\n");
		for(int i=0;i<=10;i++)
		{
			System.out.println("Thread test :"+i);
		}
		System.out.println("End of Thread test");
	}
}
class runnable_test
{
	public static void main(String args[])
	{
		test runnable=new test();
		Thread th = new Thread(runnable);
		th.start();
	}
}