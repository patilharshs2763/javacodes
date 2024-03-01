class DoWhileContinue
{
		public static void main(String[] args)
		{
			System.out.println("Break in while Loop:");
			int a=1;
			do
			{
				if(a==7)
				{
					continue;
				}
				System.out.println (" " +a);
				a++;
			}while(a<=10);
		}
}