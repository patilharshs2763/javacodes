import javax.swing.*;
public class Frame_swing extends JFrame
{
    JFrame F;
Frame_swing(){
	JTextField t=new JTextField();
	t.setBounds(50, 120, 100, 100);
	add(t);

	JButton b = new JButton("Button");
    b.setBounds(50,60,70,70);
	add(b);
	
	setSize(500,500);
	setLayout(null);   
    
	setVisible(true);
	}
	public static void main(String args[])
	{
		new Frame_swing();
	}  
}