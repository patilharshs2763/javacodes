//10.wap to multiply two matrices

class matrix_mul
{
	public static void main(String args[])
	{
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]={{9,8,7},{6,5,4},{3,2,1}};
		int c[][]=new int[3][3];
		System.out.println("\nMatrix no 1 : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\nMatrix no 2 : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\nMatrix Result : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				{
					c[i][j]=0;
					for(int k=0;k<3;k++)
						{
							c[i][j]+=a[i][k]*b[k][j];
						}
					System.out.print(c[i][j]+" ");
				}
			System.out.println();
		}
	}
}

