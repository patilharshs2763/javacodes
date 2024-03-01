import java.applet.*;  
import java.awt.*;  
  
public class GraphicsDemo extends Applet{  
  
public void paint(Graphics g){  
	//g.setColor(Color.cyan);  
	
	//g.drawLine(40,40,500,40);		//g.drawLine(x1,y1,x2,y2);
	//g.drawLine(40,40,40,500);
									
	//g.drawRect(70,70,100,70);  	//g.drawRect(x,y,width,height);
	//g.fillRect(70,70,100,70);  

	//g.drawOval(10,10,150,200);	//g.fillOval(x,y,width,height);
	//g.fillOval(10,10,150,150);
	
	//g.drawRoundRect(x,y,width,height,widtha,heighta);	
	//g.drawRoundRect(30,30,100,60,30,30); 
	//g.fillRoundRect(40,40,100,60,30,30);
	  
	g.setColor(Color.pink);  
	  
	g.drawArc(50,100,150,150,0,180); //g.drawArc(x,y,width,height,startAngle,arcAngle)
	//g.fillArc(0,30,300,300,45,180);  
	//g.drawString("Color:"+g.getColor(),5,20);
	  
	}  
}
/*
<applet 
	code="GraphicsDemo.class" 
	width="300" height="300"
/applet> 
*/