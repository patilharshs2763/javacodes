import java.awt.*;
import javax.swing.*;
//import javax.swing.JApplet.*;

/*<applet code="JTabDemo.class" height="200" width="400">
</applet>*/


class pnl1 extends JPanel
{
	public pnl1()
	{
		JCheckBox jcb1=new JCheckBox("Red");
		JCheckBox jcb2=new JCheckBox("Blue");
		JCheckBox jcb3=new JCheckBox("Green");
		JCheckBox jcb4=new JCheckBox("Yellow");
		add(jcb1);
		add(jcb2);
		add(jcb3);
		add(jcb4);
	}
}
class pnl2 extends JPanel
{
	public pnl2()
	{
		JButton jbt1=new JButton("Chocolate");
		JButton jbt2=new JButton("Vanilla");
		JButton jbt3=new JButton("Str");
		JButton jbt4=new JButton("Pineapple");
		add(jbt1);
		add(jbt2);
		add(jbt3);
		add(jbt4);
	}
}
class pnl3 extends JPanel
{
	public pnl3()
	{
		JComboBox jcb=new JComboBox();
		jcb.addItem("Cicle");
		jcb.addItem("Oval");
		jcb.addItem("Rectangle");
		jcb.addItem("Square");
		
		add(jcb);
	}
}

public class JTabDemo extends Applet
{
	public void start()
	{
		Container ct=getContentPane();
		JTabbedPane jtp=new JTabbedPane();
		jtp.addTab("Colors",new pnl1());
		jtp.addTab("Flavours",new pnl2());
		jtp.addTab("Shapes",new pnl3());
		ct.add(jtp);
	}
	
}


