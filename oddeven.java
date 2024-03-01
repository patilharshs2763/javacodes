//3.Program to find odd or even number

import java.util.Scanner;
class oddeven
{
public static void main(String args[])
{
   int n;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter No: ");
   n=sc.nextInt();
   if(n%2==0)
   System.out.println(n+" is even.");
   else
   System.out.println(n+" is odd.");
   }
   }