import java.awt.*;
import java.awt.event.*;
class event3{
  event3(){
    Frame f= new Frame();
    TextField t=new TextField();
    Button b=new Button("Submit");

    t.setBounds(90,40,40,50);
    b.setBounds(20,150,150,50);

    f.add(b);
    f.add(t);
    f.setSize(400,400);

    f.setTitle("Event Handling Program");
    f.setLayout(null);
    f.setVisible(true);

  }
  public static void main(String[] args) {
    event3 e1=new event3();
    t.setText("Hii");
  }
}
