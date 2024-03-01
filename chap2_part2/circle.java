public class static_method 
{
	 static double radius=100,area;
	 final static double pi=3.14578;
	 
	 static void display()
	 {
	 static_method.area=(double)(pi*static_method.radius*static_method.radius);
	 System.out.println("THE AREA OF CIRCLE IS : "+static_method.area);
	 }
}
class circle
	{
		 public static void main(String args[])
		 {
		 static_method s=new static_method();
		 static_method.display();
	 } 
}