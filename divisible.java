//11.Write a program to check whether the given number is divisible by 5 or not. 

import java.util.Scanner;
class divisible
{
public static void main(String args[])
{
   int n;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter No: ");
   n=sc.nextInt();
   if(n%5==0){
   System.out.println(n+" is divisible by 5.");
   }
   else{
   System.out.println(n+" is not divisible by 5.");
   }
   }
   }