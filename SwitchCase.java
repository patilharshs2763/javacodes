import java.util.Scanner;
class SwitchCase
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice: ");
		int ch = sc.nextInt();
		switch(ch)
        {
        case 0:
            System.out.println("Entered zero.");
            break;
        case 1:
            System.out.println("Entered one.");
            break;
        case 2:
            System.out.println("Entered two.");
			break;
		case 3:
            System.out.println("Entered three.");
			break;
		case 4:
            System.out.println("Entered four.");
            break;
        default:
            System.out.println("Entered greater than 4.");
        }
    }
}