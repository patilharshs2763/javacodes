import java.awt.*;
public class Label1 {
public static void main(String args[]){
	Frame f = new Frame ("Label example");
	Label lb1, lb2,lb3,lb4,lb5,lb6;
	lb1 = new Label ("GPK");
	lb2 = new Label ("DYP");
	lb3 = new Label ("KIT");
	lb4 = new Label ("SGI");
	f.add(lb1);
	f.add(lb2);
	f.add(lb3);
	f.add(lb4);
	f.setSize(250,250);
	f.setLayout(new FlowLayout(FlowLayout.CENTER));
	f.setVisible(true);
	}
}
