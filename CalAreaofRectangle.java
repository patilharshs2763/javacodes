class Rect
{
            int l,b;
}
class CalAreaofRectangle
{
            public static void main (String args[])
            {
                        int a;
                        Rect rect = new Rect();
                        rect.l=10;
                        rect.b=5;
                        a=rect.l*rect.b;
                        System.out.println("Area of Rectangle is : "+a);
            }
}