//circle_oval
import java.awt.*;
import java.applet.*;

public class circle_oval extends Applet
{
	public void paint(Graphics g)
	{
		g.drawOval(10,10,90,90);
		g.fillOval(150,10,120,90);
		g.drawOval(300,10,125,100);
		
		g.fillOval(20,150,200,150);
		
	}
}

/*
<APPLET
CODE=circle_oval.class
WIDTH=500
HEIGHT=500>
</APPLET> */