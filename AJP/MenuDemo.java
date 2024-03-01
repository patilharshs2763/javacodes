import java.awt.*;

class MenuDemo extends Frame{
	MenuDemo(){
		Frame f=new Frame("MenuBar Example");
		MenuBar mb=new MenuBar();
		Menu m1=new Menu("File");
		Menu m2=new Menu("Edit");
		Menu m3=new Menu("view");
		
		MenuItem i1=new MenuItem("New");
		MenuItem i2=new MenuItem("Open");
		
		Menu i3=new Menu("Insert");
		MenuItem i4=new MenuItem("Date");
		MenuItem i5=new MenuItem("Time");
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		
		m1.add(i1);
		m1.add(i2);
		
		m2.add(i3);
		i3.add(i4);
		i3.add(i5);
		
		f.setMenuBar(mb);
		f.setVisible(true);
		f.setLayout(null);
		f.setSize(400,400);
		
	}
	public static void main(String args[]){
		new MenuDemo();
	}
}