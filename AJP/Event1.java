import java.awt.*;
import java.awt.event.*;

class Event1 implements ActionListner{
  public static void main(String[] args) {

    JtextField t= new JTextfield();
    JButton b= new JButton("Show");
    JFrame f=new JFrame("ActionListner Example");
    f.add(t);
    f.add(b);
    setBounds(50,100,60,30);
    b.addActionListner();
    f.setSize(300,300);
    f.setLayout(null);
    f.setVisible(true);

  }
  public void actionPerformed(ActionEvent e){
    t.setText("TYIT");
  }

}
