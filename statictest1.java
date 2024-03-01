class statictest
{
  //static int a;
  int a;
}
class statictest1
{
  public static void main(String args[])
   {  
     //statictest.a=10;
	 //a=10;
	 statictest s1=new statictest();
	 statictest s2=new statictest();
	 //System.out.println("statictest.a" +statictest.a);
	 //System.out.println("statictest.a" +a);
	 System.out.println("s1.a" +s1.a);
	 System.out.println("s2.a" +s2.a);
   }
}   