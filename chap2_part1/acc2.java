import java.util.Scanner;
class Bank {
	private String accno;
	private String name;
	private long balance;
	Scanner sc = new Scanner(System.in);
	void AccOpen()
	{
	System.out.print("\nEnter Account No: ");
	accno = sc.next();
	System.out.print("Enter Name: ");
	name = sc.next();
	System.out.print("Enter Balance: ");
	balance = sc.nextLong();
	}
	void AccShow()
	{
	System.out.print("-------------*****-------------\n");
	System.out.println("\nAccount No : "+accno + "\nCustomer Name : " + name +"\nBalance : " + balance);
	}
	void deposit()
	{
	long amt;
	System.out.println("\nEnter amount to deposit money: ");
	amt = sc.nextLong();
	balance = balance + amt;
	System.out.println("\nMoney deposited !!!!");
	System.out.println("Current balance : "+balance);
	}
	void debit()
	{
	long amt;
	System.out.println("\nEnter amount to debit money : ");
	amt = sc.nextLong();
	if (balance >= amt)
	{
	balance = balance - amt;
	System.out.println("\nMoney debitted !!!! ");
	System.out.println("Current balance : "+balance);
	}
	else
	{
	System.out.println("\nLow Balance !!!! \nTransaction cannot be proceed...Please enter valid amount...");
	}
	}
	boolean search(String acn)
	{
	if (accno.equals(acn))
	{
	AccShow();
	return (true);
	}
	return (false);
	}
	}
	public class acc2
	{
	public static void main(String arg[])
	{
	Scanner sc1 = new Scanner(System.in);
	System.out.print("\nEnter no. of customers account in bank : ");
	int n = sc1.nextInt();
	Bank b[] = new Bank[n];
	for (int i = 0; i < b.length; i++)
	{
	b[i] = new Bank();
	b[i].AccOpen();
	}
	int ch;
	do
	{
	System.out.print("\n-------------*****-------------\n");
	System.out.println("\n---- State Bank ----\n 1.All Account Details\n 2.Search Account\n 3.Deposit Money\n 4.Debit Money\n 5.Exit ");
	System.out.println("-------------*****-------------");
	System.out.print("Enter your choice : \n");
	ch = sc1.nextInt();
	switch (ch)
	{
	case 1:
	for (int i = 0; i < b.length; i++)
	{
	b[i].AccShow();
	}
	break;
	case 2:
	System.out.print("-------------*****-------------\n");
	System.out.print("\nFind Account number : ");
	String acn = sc1.next();
	boolean found = false;
	for (int i = 0; i < b.length; i++)
	{
	found = b[i].search(acn);
	if (found)
	{
	break;
	}
	}
	if (!found)
	{
	System.out.println("This Account does not exist !!!! Failed to search account !!!!\n");
	}
	break;
	case 3:
	System.out.print("-------------*****-------------");
	System.out.print("\nEnter Account No : ");
	acn = sc1.next();
	found = false;
	for (int i = 0; i < b.length; i++)
	{
	found = b[i].search(acn);
	if (found)
	{
	b[i].deposit();
	break;
	}
	}
	if (!found)
	{
	System.out.println("This Account does not exist !!!! \n Failed to deposit money!!!! ");
	}
	break;
	case 4:
	System.out.print("-------------*****-------------");
	System.out.print("\nEnter Account No : ");
	acn = sc1.next();
	found = false;
	for (int i = 0; i < b.length; i++)
	{
	found = b[i].search(acn);
	if (found)
	{
	b[i].debit();
	break;
	}
	}
	if (!found)
	{
	System.out.println("This Account does not exist !!!! \n Failed to debit money!!!! ");
	}
	break;
	case 5:
	System.out.println("\n\t---- Thank you ----\n ---- Always in your service ----");
	break;
	}
	}
	while (ch != 5);
	}
	}
