import javax.swing.*;
import java.awt.event.*;

class AEvent_swing1 extends JFrame implements ActionListener{
	
	JTextField tf;
	JTextField tf2;
	JButton b;
	AEvent_swing1(){
		
		tf=new JTextField();
		tf.setBounds(60,50,170,20);
		
		tf=new JTextField();
		tf.setBounds(60,240,170,20);
		
		//Button b=new Button("Submit");
		b=new JButton("Submit");
		b.setBounds(100,120,80,30);
		
		b.addActionListener(this);
		
		
		add(b);
		add(tf);
		add(tf2);
		setSize(400,300);
		
		setLayout(null);
		//f.setLayout(new FlowLayout());
		//setLayout(new FlowLayout());
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e){
		String s=tf.getText();
		tf2.setText(s);
	}
	public static void main(String[] args)
	{
		new AEvent_swing1();
	}
}