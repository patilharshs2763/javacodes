//9.wap to sort the elements of the array.

class sorting
{
	public static void main(String[] args)
	{
		int [] arr = new int [] {10,41,9,100,1,55,19};
		int temp = 0;
		System.out.println("\nElements in original array: ");
		System.out.println();
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + "\t");
		}
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("\nSorted array elements :");
		System.out.println();
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + "\t");
		}
	}
}
