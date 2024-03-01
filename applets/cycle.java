import java.applet.Applet;  
import java.awt.*;  
  

public class cycle extends Applet
{
	public void paint(Graphics g) 
	{
		g.drawOval(40,200,80,80);	//back wheeel
		g.drawOval(200,200,80,80);	//front wheeel
		g.drawLine(80,240,180,240); //paytildandi
		g.drawLine(80,240,110,160);	//ubhi
		g.drawLine(180,240,220,160); //ubhi2
		g.drawLine(110,160,220,160);	//Dandi
		g.drawLine(219,140,240,240);	//handl ci dandi
	}
}

/* 
<applet code="cycle.class" width="500" height="500">  
</applet>  
</body>  

*/