import java.applet.*;  
import java.awt.*;  
  
public class Oval extends Applet{  
  
public void paint(Graphics g){  
	//g.setColor(Color.cyan);  
	
	//g.fillOval(x,y,width,height);
	g.drawOval(10,10,150,150); 
	}  
}
/*
<html>
<body>
<applet 
	code="Oval.class" 
	width="300" height="300" >
/applet>
</body>
</html>
*/
