//5. Write a program for string methods of class string.

class StringMethods 
{
  public static void main(String[] args) 
  {

    // create a string
    String s1 = "Harshvardhan ";
	String s2="Patil";
	String s3="";
	
    System.out.println("\nString One: " + s1);	
    System.out.println("Length of String One: " + s1.length());
	System.out.println("\nString Second: " + s2);
	 System.out.println("Length of String Second : " + s1.length());
	System.out.println("\nJoinning String: " + s1.concat(s2));
	System.out.println("\nchar value at the given index number: " + s1.charAt(3));
	System.out.println("\nCompare String one to second:" +s1.compareTo(s2));
	System.out.println("\nTo lowercase: "+s1.toLowerCase());
	System.out.println("\nTo UPPERCASE: "+s1.toUpperCase());
	System.out.println("\nstring one is empty:"+s1.isEmpty()); 
	System.out.println("\nString three is emty:"+s3.isEmpty());
  }
}