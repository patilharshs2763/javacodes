//2.Write a java program to implement following functions of string: 
//(1) Calculate length of string (2) Compare between strings (3) Concatenating strings

import java.util.Scanner;

class string_functions
{
	public static void main(String[] args){
	
	System.out.println("\n**************************************");
	Scanner sc=new Scanner(System.in);
	String s1,s2;
	System.out.print("Enter fisrt string : ");
	s1=sc.next();
	System.out.print("Enter second string : ");
	s2=sc.next();
	
	//Calculate length of string 

	System.out.println("Length of first string = "+s1.length());
	System.out.println("Length of second string = "+s2.length());
	
	//Compare between strings 
	System.out.println("Comparing string = "+s1.compareTo(s2));
	
	// Concatenating strings
	System.out.println("Concatenating string = "+s1.concat(s2));
	System.out.println("**************************************");
	}
}