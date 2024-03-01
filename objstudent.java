import java.util.*;

class student
{
 String name;
 int rno,marks;
 Scanner sc=new Scanner(System.in);
 void getdata()
 {
   System.out.println("Enter roll no,name & marks");
   rno=sc.nextInt();
   name=sc.next();
   marks=sc.nextInt();
  }
void display()
  {
     System.out.println("roll no:" +rno);
	 System.out.println("name:"+name);
	 System.out.println("marks:"+marks);
	}
	}
	class objstudent
	{
	   public static void main(String[] args)
    {   int i;
	   //student s1=new student();
	   //s1.getdata();
	   //s1.display();
	   student[]stud;   //
	   stud=new student[5]; //declaration of array
	   for(i=0;i<5;i++)
	   {
		  stud[i]=new student();
	   }
      for(i=0;i<5;i++)
	  {
		  
	   stud[i].getdata();
	   stud[i].display();
	  }
	}
	}