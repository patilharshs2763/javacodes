import java.awt.*;
import java.awt.event.*;

class Act_event1 extends Frame implements ActionListener{
	TextField tf;
	Button b;
	Act_event1(){
		
		tf=new TextField();
		tf.setBounds(60,50,170,20);
		//Button b=new Button("Submit");
		b=new Button("Submit");
		b.setBounds(100,120,80,30);
		
		b.addActionListener(this);
		
		
		add(b);
		add(tf);
		setSize(400,300);
		setLayout(null);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e){
		tf.setText("TYIT");
	}
	public static void main(String [] args){
		new Act_event1();
	}
}