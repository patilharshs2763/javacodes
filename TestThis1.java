//this: to refer current class instance variable

class Student
{  
	int rollno;  
	String name;  
	float fee; 
	
	Student(int rollno,String name,float fee)
	
	//Student(int r,String n,float f)
	{  
		this.rollno=rollno;  
		this.name=name;  
		this.fee=fee;  
		
		/*rollno=r;  
		name=n;  
		fee=f;  */
	}  
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}  
}
class TestThis1
{  
	public static void main(String args[])
		{  
			Student s1=new Student(111,"Harsh",5000f);  
			Student s2=new Student(112,"Shweta",6000f);  
			s1.display();  
			s2.display();  
		}
}  