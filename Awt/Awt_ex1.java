import java.awt.*;
public class Awt_ex1 extends Frame
{
	Awt_ex1(){
		Button b = new Button("Click Me!!");
		b.setBounds(50,100,100,40);
		add(b);
		setSize(400,400);
		setTitle("This is our basic AWT example");
		setLayout(null);
		setVisible(true);
		}
	public static void main(String args[]){
		Awt_ex1 f = new Awt_ex1();
	}
}
