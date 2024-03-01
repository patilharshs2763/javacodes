import java.util.Scanner;
class SwitchCase2
{
	public static void main(String[] args)
	{
	int no1,no2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your first No:");
	no1=sc.nextInt();
	System.out.println("Enter Your Second No:");
	no2=sc.nextInt();
	System.out.print("Enter an operator (+, -, *, /): ");
	char op = sc.next().charAt(0);
	double result=0.0;
	
	{
	switch(op)
	{
		case '+':result=no1+no2;
			break;
		
		case '-':result=no1+no2;
			break;
		
		case '*':result=no1+no2;
			break;
		
		case '/':result=no1+no2;
			break;
		default:
				System.out.println("Entered wrong operator!");
	}
	System.out.println(no1+" "+op+" "+no2+"="+result);
	}
	
}
