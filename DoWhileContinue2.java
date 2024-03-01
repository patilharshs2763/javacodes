class DoWhileContinue2
{
		public static void main(String[] args)
		{
			
			int a=1;
			do
			{
				if(a==7)
				{
					a++;
					continue;
				}
				System.out.println (" " +a);
				a++;
			}while(a<=10);
		}
}