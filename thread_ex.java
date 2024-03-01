class Th extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
			System.out.println(i);
		}
	}
}
class thread_ex
{
	public static void main(String args[])
	{
		Th t = new Th();
		Th t1 = new Th();
		t.start();
		t1.start();
		System.out.println("\nID = "+t.getId());
		System.out.println("Name = "+t.getName());
		t.setName("Harsh");
		System.out.println("Set Name = "+t.getName());
		System.out.println("Priority = "+t.getPriority());
	}
}