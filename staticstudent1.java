class student
{
 
 static int rno;
 static String name;
 
  static 
  {
    rno=123;
	name="abc";
  }
  static 
  {
    rno=456;
	name="def";
  }
 }
 class staticstudent1
 {
   public static void main(String args[])
   {
    
	 System.out.println("roll no:"    +student.rno);
	 System.out.println("name:"    +student.name);
	 
	 //System.out.println("roll no:"    +student.rno);
	 //System.out.println("name:"    +student.name);
	}
}	