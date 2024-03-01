//7.wap to perform linear search in an array.

import java.util.Scanner;
class LinearSearch
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int array[];
		array=new int[10];
		System.out.println("\n**************************************");
		System.out.println("Enter the elements of Array : ");
		for(int i=0;i<10;i++)
		array[i]=sc.nextInt();
		System.out.println("Elements of Array are : ");
		for(int i=0;i<10;i++)
		System.out.print("  "+array[i]);
		System.out.println("\n-------------------------------------");
		System.out.println("\nEnter the element to be searched :");
		int key=sc.nextInt();
		int count=0;
		
		for(int i=0;i<array.length;i++)
		{
			 if(array[i]==key)
			 count++;
		}
		if(count>0)
		{
			System.out.println(key+" found "+count+" times ");
		}
		else System.out.println(key+" not found!!! ");
	
	System.out.println("\n**************************************");
	}
}
