import java.util.Scanner;
public class ArithmeticOperators
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First no:");
	int a= sc.nextInt();
	System.out.println("Enter Second no:");
	int b= sc.nextInt();
	//int c,d,e,f,g;
	
	System.out.println("Sum = " +(a+b));
	System.out.println("Sub = "+(a-b));
	System.out.println("Mult = "+(a*b));
	System.out.println("Div = "+(a/b));
	System.out.println("Modulo = "+(a%b));
}
}