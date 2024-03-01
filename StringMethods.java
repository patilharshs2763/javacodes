class StringMethods 
{
  public static void main(String[] args) 
  {

    // create a string
    String s1 = "Harshvardhan";
	String s2="Patil";
	String s3="";
	String s4="I am Hrshvardhan";
	String s6="haRshvArdhan";
    System.out.println("String One: " + s1);
	
    System.out.println("Length of String One: " + s1.length());
	
	System.out.println("String Second: " + s2);
	System.out.println("Joinning String: " + s1.concat(s2));
	System.out.println("char value at the given index number: " + s1.charAt(3));
	System.out.println("Compare String one to second:" +s1.compareTo(s2));
	System.out.println("To lowercase: "+s1.toLowerCase());
	System.out.println("To UPPERCASE: "+s1.toUpperCase());
	System.out.println("string one is empty:"+s1.isEmpty()); 
	System.out.println("String three is emty:"+s3.isEmpty());
	//trim()
	System.out.println("String four for replacing:"+s4);
	String s5=s4.replace("Harshvardhan","patil");
	System.out.println("Harshvardhan replaced with Patil:"+s5);
	System.out.println("String one and string second is equal:"+s1.equals(s2));
	System.out.println("harshvardhan and haRshvArdhan is equal or not:"+s1.equalsIgnoreCase(s6));
	System.out.println("string four ends with the n suffix:"+s4.endsWith("n")); 
	
	char ch ='H';
	System.out.println("find the index of a specified (H)character from string four:"+s4.indexOf(ch));
	System.out.println("find out the index of last occurrence of a character(Harshvardhan):"+s1.lastIndexOf('a'));
	System.out.println("to get the substring from string four:"+s4.substring(3));
  }
}