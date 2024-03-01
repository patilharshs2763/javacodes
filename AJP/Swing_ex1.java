import javax.swing.*;
class Swing_ex1{
	Swing_ex1(){
		JFrame f= new JFrame();
		JLabel l=new JLabel("Emp ID:");
		JButton b=new JButton("Submit");
		JTextField t=new JTextField();
		
		l.setBounds(20,80,80,30);
		t.setBounds(20, 110, 80, 30);
		b.setBounds(100, 100, 80, 30);
		
		f.add(l);
		f.add(b);
		f.add(t);
		
		f.setSize(400,400);
		
		f.setTitle("Emp Info Frame ex");
		
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]){
		Swing_ex1 awt_obj=new Swing_ex1();
	}
}