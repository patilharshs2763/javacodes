//11.	wap to print the difference between largest and smallest element in an array.
import java.util.Scanner;
public class Array_Def
{
	public static void main(String args[])
	{
		int large,small,i;
		int a[] = {61, 82, 93, 24, 55};
		int n = a.length;
		large=small=a[0];
		for(i=1;i<n;++i)
			{
				if(a[i]>large)
				large=a[i];
			
				if(a[i]<small)
				small=a[i];
			}
			System.out.print("\nThe Smallest element in array is : "+ small );
			System.out.println("\nThe Largest element in array is : " + large );
	}
}
