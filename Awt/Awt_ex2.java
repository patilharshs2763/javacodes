import java.awt.*;
class Awt_ex2
{
	Awt_ex2() 
	{
		Frame f = new Frame();
		Label l = new Label("Student Rno.:");
		Button b = new Button("Submit"); 
		TextField t = new TextField();
		l.setBounds(50, 80, 80, 30);
		t.setBounds(50, 100, 80, 30);
		b.setBounds(130, 100, 80, 30);
		f.add(b);
		f.add(l);
		f.add(t);
		f.setSize(400,300);
		f.setTitle("Student info");
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		Awt_ex2 obj = new Awt_ex2();
	}
}
