//9.Program to display multiplication of given no. 

import java.util.Scanner;
class multiplication
{
public static void main(String args[])
{
   int n,n2,res;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter Fist No: ");
   n=sc.nextInt();
   System.out.print("Enter Second No: ");
   n2=sc.nextInt();
   
   res=n*n2;
   
   System.out.print("Multiplication is : "+res);
   }
}