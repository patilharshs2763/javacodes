import java.applet.*;  
import java.awt.*;  
  
public class Ellipse_Rect extends Applet{  
  
public void paint(Graphics g){  
	g.setColor(Color.cyan);  
	
	g.drawOval(10,10,150,200);
	g.fillRoundRect(40,40,100,60,30,30);
	}  
}
/*
<applet 
	code="Ellipse_Rect.class" 
	width="300" height="300"
/applet> 
*/