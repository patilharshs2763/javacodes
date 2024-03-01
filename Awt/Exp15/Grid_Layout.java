import java.awt.*;
import java.awt.event.*;
public class Grid_Layout
{
	public static void main(String[] args)
	{
		Frame frame= new Frame("FlowLayout Frame");
		Panel pa= new Panel();
		Button ba1= new Button();
		Button ba2=new Button();
		Button ba3=new Button();
		Button ba4=new Button();
		Button ba5=new Button();
		frame.add(pa);
		pa.setLayout(new GridLayout());
		pa.add(new Button("CARS"));
		pa.add(new Button("MG"));
		pa.add(new Button("KIA"));
		pa.add(new Button("TOYOTA"));
		pa.add(new Button("MINI"));
		frame.setSize(300,300);
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
