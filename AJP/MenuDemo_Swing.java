import javax.swing.*;

class MenuDemo_Swing extends JFrame{
	MenuDemo_Swing(){
		JFrame f=new JFrame("MenuBar Example");
		JMenuBar mb=new JMenuBar();
		JMenu m1=new JMenu("File");
		JMenu m2=new JMenu("Edit");
		JMenu m3=new JMenu("view");
		
		JMenuItem i1=new JMenuItem("New");
		JMenuItem i2=new JMenuItem("Open");
		
		JMenu i3=new JMenu("Insert");
		JMenuItem i4=new JMenuItem("Date");
		JMenuItem i5=new JMenuItem("Time");
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		
		m1.add(i1);
		m1.add(i2);
		
		m2.add(i3);
		i3.add(i4);
		i3.add(i5);
		
		f.setJMenuBar(mb);
		f.setVisible(true);
		f.setLayout(null);
		f.setSize(400,400);
		
	}
	public static void main(String args[]){
		new MenuDemo_Swing();
	}
}