/*import java.awt.*;
public class example extends Frame{
	example{
		Button b = new Button("Button");
		b.setBound(30,100,80,30);
		add(b);
		setTitle("FRAME ex");
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String args[])
	{
		example f = new example();
	}
}*/
// importing Java AWT class  
import java.awt.*;    
  

public class example extends Frame {    
   example() {    
      Button b = new Button("Click Me!!");  
      b.setBounds(30,100,80,30);  
  
          
      add(b);  
  
         
      setSize(300,300);  
  
    setTitle("This is our basic AWT example");   
          
    setLayout(null);   
  
    setVisible(true);  
}
public static void main(String args[]) { 
example f = new example();    
  
}  
  
}