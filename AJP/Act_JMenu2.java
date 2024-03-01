import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class Act_JMenu2 extends JFrame implements ActionListener{
	
	JFrame f;
	JTextArea ta;
	JMenuBar mb;
	JTextField tf;
	JMenuItem copy,paste,cut,select,del;
	
	Act_JMenu2(){
		f=new JFrame("MenuBar Example");
		ta=new JTextArea(); //new JTextArea();
		tf=new JTextField();
		
		mb=new JMenuBar();
		JMenu m1=new JMenu("File");
		JMenu m2=new JMenu("Edit");
		JMenu m3=new JMenu("view");
		
		copy=new JMenuItem("Copy");
		cut=new JMenuItem("Cut");
		paste=new JMenuItem("Paste");
		select=new JMenuItem("Select All");
		del=new JMenuItem("Delete");
		
		JMenu i3=new JMenu("Insert");
		JMenuItem i4=new JMenuItem("Date");
		JMenuItem i5=new JMenuItem("Time");
		
		f.add(ta); //new
		ta.setBounds(10,40,200,200);
		
		f.add(tf);
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		
		m2.add(copy);
		m2.add(cut);
		m2.add(paste);
		m2.add(del);
		m2.add(select);
		
		m3.add(i3);
		i3.add(i4);
		i3.add(i5);
		
		
		//actionlisteners
		copy.addActionListener(this);
		cut.addActionListener(this);
		paste.addActionListener(this);
		//del.addActionListener(this);
		select.addActionListener(this);
		
		f.setJMenuBar(mb);
		f.setVisible(true);
		f.setLayout(null);
		f.setSize(400,400);
		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==copy)
			ta.copy();
		if(e.getSource()==cut)
			ta.cut();
		if(e.getSource()==paste)
			ta.paste();
		/*if(e.getSource==del)
			ta.delete();*/
		if(e.getSource()==select)
			ta.selectAll();
	}
	public static void main(String[] args){
		new Act_JMenu2();
	}
}