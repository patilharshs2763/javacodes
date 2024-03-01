/*The command-line arguments are passed to the program at run-time. 
Passing command-line arguments in a Java program is quite easy. 
They are stored as strings in the String array passed to the args[] parameter of the main() method in Java.*/

//1.Write a program to accept two numbers as command line arguments and print the addition of those numbers. 

class sum_cmdarg
{  
	public static void main(String args[])  
		{  
			int no1 = Integer.parseInt(args[0]);
			int no2 = Integer.parseInt(args[1]); 			
			int sum = no1 + no2;  
			System.out.println("The sum of no1 and no2 is: " +sum);  
		}
}