import java.awt.*;
import java.applet.*;
public class colorset extends Applet
{
	Color obj = new Color(225,192,203);
	Font f = new Font("Calibri",Font.BOLD,50);
	public void paint(Graphics g)
	{
		 g.setColor(obj);
		  g.setFont(f);
		   g.drawString("Hello Applet..",20,80);
	}
}
/*
<applet code="colorset.class" width="500" height="500" >
</applet>
 */