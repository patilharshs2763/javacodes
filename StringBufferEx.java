class StringBufferEx
{
	public static void main(String[] args)
	{
		//String s1="Harshvardhan";
		StringBuffer s1=new StringBuffer("Harshvardhan ");
		int a=s1.length();
		int b=s1.capacity();
		System.out.println("Length of string:"+a);
		System.out.println("capacity of string:"+b);
		
		s1.append("Patil");
		System.out.println("Append method:"+s1);
		s1.insert(12," S");
		System.out.println("Insets:"+s1);
		s1.deleteCharAt(13); 
		System.out.println("deleteCharAt:"+s1);
		s1.delete(0,14);
		System.out.println("Delete:"+s1); 
		
		s1.reverse();
		System.out.println("Revesre string:"+s1);
		
		//s1.replace(,, "");
		//System.out.println(s1);

		
	}
}