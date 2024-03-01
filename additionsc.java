import java.util.Scanner;

public class additionsc{

 public static void main(String[] args) {
	 int a,b,sum;

  // reading input from user
  Scanner sc= new Scanner(System.in);
  System.out.print("Enter First Number : ");
  a= sc.nextInt();
  System.out.print("Enter Second Number : ");
  b= sc.nextInt();

  // summing two numbers
  sum= a + b;

  System.out.println("Scanner example to Sum of two numbers (" + a + ", " + b + ") = " + sum);

 }

}