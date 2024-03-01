class DoWhileBreak
{
		public static void main(String[] args)
		{
			System.out.println("Break in while Loop:");
			int a=1;
			while(a<=10)
			{
				if(a==7)
				{
					break;
				}
				System.out.println (" " +a);
				a++;
			}
		}
}