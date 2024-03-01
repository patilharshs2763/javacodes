// Java code for using this to invoke current class  method class thisDemo2

class thisDemo2
{
	void disp()
	{
		this.show();
		System.out.println("Inside disp function..");
	}
	void show()
	{
		//this.disp();
		System.out.println("Inside show function..");
	}
	public static void main(String[] args)
		{
			thisDemo2 obj = new thisDemo2(); 
			obj.disp();
			//obj.show();
		}
}