import java.io.*;
class addition22
{
public static void main(String args[])throws IOException
{
   int n1,n2,sum;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter first number");
   n1=Integer.parseInt(br.readLine());
   System.out.println("Enter Second number");
   n2=Integer.parseInt(br.readLine());
   sum=n1+n2;
   System.out.println("Sum " +sum);
   }
   }