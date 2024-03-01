import java.awt.*;
import java.awt.event.*;
class event_ex extends Frame implements ActionListener{
TextField t;
TextField t1;
event_ex(){
t=new TextField();
//t.setbounds(60,50,170,200);
t1=new TextField();
//t.setbounds(60,50,170,200);

Button b=new Button("Submit");
b.setBounds(120,120,80,30);
b.addActionListener(this);
add(b);
add(t);
add(t1);
setSize(300,300);
//setLayout();
setLayout(new FlowLayout());
setVisible(true);

}
public void actionPerformed(ActionEvent e){
//t.getText();
t1.setText(t.getText());

}
public static void main(String args[]){
new event_ex();
}
}