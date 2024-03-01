/*import java.awt.*;
import java.awt.event.*;

class Aevent1 extends Frame{
	TextField t;
	Aevent1(){
		t=new TextField();
		t.setBounds(60,50,100,30);
		
		Button b=new Button("Show");
		b.setBounds(60,150,80,30);
		
		
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(){
				t.setText("Hii Harsh");
			}
		});
		
		add(t);
		add(b);
		setSize(500,400);
		setVisible(true);
		setLayout(null);
	}
	public static void main(String args[]){
		new Aevent1();
	}
}*/

import java.awt.*;  
import java.awt.event.*;  
class Aevent1 extends Frame{  
TextField tf;  
Aevent1(){  
tf=new TextField();  
tf.setBounds(60,50,170,20);  
Button b=new Button("click me");  
b.setBounds(50,120,80,30);  
  
b.addActionListener(new ActionListener(){  
public void actionPerformed(){  
tf.setText("hello");  
}  
});  
add(b);add(tf);  
setSize(300,300);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String args[]){  
new Aevent1();  
}  
}  