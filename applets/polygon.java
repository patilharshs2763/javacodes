import java.applet.*;  
import java.awt.*;  
  
public class polygon extends Applet{  
  

	/*
	int x[]={30 , 70, 120};   //array method
	int y[]={120 , 30, 120};*/
	public void paint(Graphics g){ 
	
	//g.fillPolygon(x ,y , 3 );
	
	/*g.drawLine(10,20,170,40);	//drawLine method 
	g.drawLine(170,40,80,140);
	g.drawLine(80,140,10,20);*/
	
	int x[]={10,170,80,10};  
	int y[]={20,40,140,20};
	int n=4;
	
	g.fillPolygon(x ,y ,n);

/*
	g.drawLine(10,10,170,10);
	g.drawLine(10,10,90,90);
	g.drawLine(170,10,90,90);
	
*/
	}  
}
/* 
<applet code="polygon.class" width="500" height="500">  
</applet>  


*/