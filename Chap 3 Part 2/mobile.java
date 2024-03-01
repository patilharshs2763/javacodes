//3.wap for inheriting constructor using super keyword

class mobile
{
String brand = "Samsung Galaxy";
int price=15000;
String RAM = "4 GB";
String ROM = "64 GB";
mobile()
{
System.out.println("\n***** Mobile phone details *****");
}
void brand()
{
System.out.println("\nBrand of Mobile : "+brand);
}
void cost()
{
System.out.println("Price of Samsung : "+price);
}
void RAM()
{
System.out.println("RAM : "+RAM);
}
void ROM()
{
System.out.println("ROM : "+ROM);
}
}
class features extends mobile
{
String brand = "Oneplus";
int price = 30000;
String RAM = "8 GB";
String ROM = "128 GB";
void brand()
{
System.out.println("\nBrand of Mobile : "+brand);
}
void cost()
{
System.out.println("Price of Oneplus : "+price);
}
void RAM()
{
System.out.println("RAM : "+RAM);
}
void ROM()
{
System.out.println("ROM : "+ROM);
}
void details()
{
super.brand();
super.cost();
super.RAM();
super.ROM();
brand();
cost();
RAM();
ROM();
}
}
public class superinherit{
public static void main(String[] args) {
features f1 = new features();
f1.details();
}
}
