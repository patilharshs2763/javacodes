//8.wap to count the number of each character in a word
import java.util.*;
public class eachChar 
{
		public static void main(String args[])
	{
		String name;
		int i,j;
		int [] count=new int[100];
		Scanner sc=new Scanner (System.in);
		System.out.println("\n**************************************");
		System.out.print("Enetr the string: ");
		name=sc.nextLine(); 
		System.out.println("\n**************************************");
		int d=name.length();
		count[0]=1;
		for(i=0;i<d;i++)
			{
				for(j=1;j<d;j++)
				{
					if (name.charAt(i)==name.charAt(j))
					{
						count[i]++;
					}
				}
				System.out.println("Count of "+name.charAt(i)+" in String "+name+" is "+count[i]);
				System.out.println("------------------------------------");
			}
	}
}
