class Reverse 
{
 
 int num;
 
 Reverse(int n) 
 {
  num = n;
 }
 void calReverse() 
 {
  int rev=0;
  System.out.print("Reverse of number " + num + " is = ");
  while(num > 0) 
  {
   rev = rev * 10 + (num % 10);
   num=num/10;
  }
  System.out.println(rev);
 }
 
 public static void main(String[] args) 
 {
  Reverse r1 = new Reverse(547);
  r1.calReverse();
 }
}
