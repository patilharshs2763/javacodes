/*WAP to create class student having methods getmarks() & disp().getmarks()
should accept rno,name & marks of student and disp() should print the same. 
Create array of objects and execute the task for 5 student.
Harshvardhan S Patil (196037)*/

import java.util.*;

class student
{
 String name;
 int rno,marks;
 Scanner sc=new Scanner(System.in);
 void getdata()
 {
   System.out.println("\nEnter roll:");
   rno=sc.nextInt();
   System.out.println("Enter name:");
   name=sc.next();
   System.out.println("Enter marks:");
   marks=sc.nextInt();
  }
void display()
  {
     System.out.println("\nRoll no:" +rno);
	 System.out.println("Name:"+name);
	 System.out.println("Marks:"+marks);
	}
	}
	class ArrayObjStd
	{
	   public static void main(String[] args)
    {  
	   int i;
	   student[]stud;   //declaration of array
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