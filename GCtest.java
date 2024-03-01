class GCtest1
{
  GCtest1()
  {
    System.out.println("Object is created");
 }
   protected void finalize()throws Throwable
   {
	 System.out.println("Garbage collector is called");
	 System.out.println("Object is destroyed" +this);
   }	   
}
class GCtest
{
  public static void main(String[] args)
  {
       GCtest1 t1=new GCtest1();
	   GCtest1 t2=new GCtest1();
	   t1=null;      //Nullifying referance variable
	   System.gc(); //Requesting JVM for running garbage collector
	   t2=null;
	   Runtime.getRuntime().gc();//Requesting JVM for running garbage collector
	   
   }
}   