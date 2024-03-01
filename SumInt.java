//d. Write a program to find the no. and sum of all integers greater than 100 and less than 200 that are divisible by 7.
class SumInt 
{
	public static void main(String args[])
	{
		double sum=0; int numcnt=0;
		for(int i=101;i<200;i++)
			{
				if(i%7==0)
					{
						sum=sum+i;
						numcnt++;
					}
			}
			System.out.println("No of elements : "+numcnt);
			System.out.println("Sum of elements : "+sum);
	}
}
