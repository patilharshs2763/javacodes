import javax.swing.*;
import java.awt.event.*;

class AEvent_swing extends JFrame implements ActionListener{
	JTextField tf;
	JButton b;
	AEvent_swing(){
		
		tf=new JTextField();
		tf.setBounds(60,50,170,20);
		//Button b=new Button("Submit");
		b=new JButton("Submit");
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
		new AEvent_swing();
	}
}