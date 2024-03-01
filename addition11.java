import java.io.*;
class addition11
{
public static void main(String args[])
{
   int n1,n2,sum;
      n1=Integer.parseInt(args[0]);  //parseInt is method of class integer which converts string to int
	  n2=Integer.parseInt(args[1]);
	 // n1=(args[0]);
	 // n2=(args[1]);
	  sum=n1+n2;
	  System.out.println("Sum:"+sum);
}
}