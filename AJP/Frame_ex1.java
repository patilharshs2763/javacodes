import java.awt.*;

class AWTExample2 {

  AWTExample2() {

    Frame f = new Frame();
    Label l = new Label("Employee id:");
    // Label l2 = new Label("Employee Name:");
    // Label l3 = new Lable("Employee qualification");
    Button b = new Button("Submit");

    TextField t = new TextField("Type here");
    // TextField t2 = new TextField("Type here");
    // TextField t3 = new TextField("Type here");

    // l.setBounds(20, 80, 80, 30);
    // t.setBounds(20, 100, 80, 30);
    // b.setBounds(100, 100, 80, 30);
    f.setBackground(Color.red);

    f.add(l);
    f.add(t);

    f.add(b);

    f.setSize(800, 500);

    f.setTitle("Employee info");
    f.setLayout(new FlowLayout());
    f.setVisible(true);
  }

  public static void main(String args[]) {

    AWTExample2 awt_obj = new AWTExample2();

  }

}
