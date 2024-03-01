class student
{
 
 static int rno;
 static String name;
 
  static 
  {
    rno=1;
	name="Raya";
  }
 }
 class staticstudent
 {
   public static void main(String args[])
   {
     //statictest.display();
	 //display();
	 System.out.println("roll no:"    +student.rno);
	 System.out.println("name:"    +student.name);
	}
}	