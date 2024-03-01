import java.awt.*;
import java.applet.*;
public class ass11 extends Applet
{
	public void paint(Graphics g)
	{
	g.drawLine(20,250,400,250);
	
	g.drawRect(30,40,250,90);
	g.fillRect(30,150,250,90);
	
	g.drawRoundRect(30,300,250,90,10,10);
	g.fillRoundRect(30,420,250,90,10,10);
	
	}
}
/*
<APPLET
CODE=ass11.class
WIDTH=600
HEIGHT=600>
</APPLET> */