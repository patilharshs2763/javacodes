import java.awt.*;
public class Checkbox1
{
public Checkbox1() {
		Frame f = new Frame("Checkbox Example");
		Checkbox checkbox1 = new Checkbox("JPR",true);
		Checkbox checkbox2 = new Checkbox("NAD",true);
		Checkbox checkbox3 = new Checkbox("PHP");
		Checkbox checkbox4 = new Checkbox("ISE");

		f.add(checkbox1);
		f.add(checkbox2);
		f.add(checkbox3);
		f.add(checkbox4);

		f.setSize(400,400);
		f.setLayout(new GridLayout(1,4));
		f.setVisible(true);
	}
	public static void main (String args[])
	{
		new Checkbox1();
	}
}
