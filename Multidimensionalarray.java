//Multidimensional array
class Multidimensionalarray
{
	public static void main(String[] args)
	{

		int[ ][ ] arr = { { 1, 2 ,3,4}, { 56,7,8} ,{9,10,11,12} ,{13,14,15,16}  };

		for (int i=0;i<4;i++)
		{
			for (int j=0; j<4;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
