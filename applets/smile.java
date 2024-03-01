import java.applet.Applet;  
import java.awt.*;  
  
public class smile extends Applet{  
  
public void paint(Graphics g){ 

	g.setColor(Color.yellow);
	g.fillOval(40,40,120,150);  //head
	
	g.setColor(Color.black);
	g.drawOval(57,75,30,20);  //lefteye
	g.drawOval(110,75,30,20);  //righteye
	
	g.setColor(Color.black);
	g.fillOval(68,81,10,10); //pupill (lefteye)
	g.fillOval(121,81,10,10); //pupill(righteye)
	g.setColor(Color.red);
	g.fillOval(85,100,30,30);  //nose
	g.setColor(Color.black);
	g.fillArc(60,125,80,40,180,180); //mouth
	g.setColor(Color.yellow);
	g.fillOval(25,92,15,30); //leftear
	g.fillOval(160,92,15,30);  //rightear
	}  
}
/*
<applet 
	code="smile.class" 
	width="500" height="500">
/applet> 
*/