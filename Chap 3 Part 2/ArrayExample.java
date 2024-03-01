//10. WAP How will you create ,declare and initialise arrays in java and how will you access elements of the array.

public class ArrayExample
{
	public static void main(String[] args)
	{
		int[] arr; //declaration
		
		arr = new int[5]; //instantiation
		
		arr[0] = 10; //initialization
		
		//accessing and printing array elements
		
		System.out.println("\nArray[0] = " + arr[0]);
		System.out.println("Array[1] = " + arr[1]);
		
		//initialization with array literal
		
		int [] LitArray = {1,2,3,4};
		System.out.println("\nLitArray[0] = " + LitArray[0]);
		System.out.println("LitArray[1] = " + LitArray[1]);
		System.out.println("LitArray[2] = " + LitArray[2]);
		System.out.println("LitArray[3] = " + LitArray[3]);
	}
}