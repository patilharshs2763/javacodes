//11.	wap to print the difference between largest and smallest element in an array.


public class arrayele
{
	public static void main(String args[])
	{
		int large,small,i;
		int a[] = {50, 82, 41, 10, 101};
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
