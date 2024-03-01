import java.awt.*;
import java.awt.event.*;
public class Border_Layout
{
	public static void main(String[] args)
	{
		Frame frame= new Frame("BorderLayout Frame");
		Panel pa= new Panel();
		Button ba1= new Button();
		Button ba2=new Button();
		Button ba3=new Button();
		Button ba4=new Button();
		Button ba5=new Button();
		frame.add(pa);
		pa.setLayout(new BorderLayout());
		pa.add(new Button("North"), BorderLayout.NORTH);
		pa.add(new Button("South"), BorderLayout.SOUTH);
		pa.add(new Button("East"), BorderLayout.EAST);
		pa.add(new Button("West"), BorderLayout.WEST);
		pa.add(new Button("Center"), BorderLayout.CENTER);
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e)
		{
		System.exit(0);
		}
		});
	}
}
