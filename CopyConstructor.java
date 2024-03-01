// Example of copy constructor
//for display info of rectangle
class CopyConstructor
{
	int height;
	int width;
	
	CopyConstructor(int h,int w)
	{
		height=h;
		width=w;
	}
	CopyConstructor(CopyConstructor s)
	{
		height=s.height;
		width=s.width;
	}
	void display()
	{
		System.out.println("Height: "+height+ "Width:"+width);
	}
	public static void main(String[] args)
	{
		CopyConstructor obj1=new CopyConstructor(11,12);
		CopyConstructor obj2=new CopyConstructor(obj1);
		
		obj1.display();
		obj2.display();
	}
}