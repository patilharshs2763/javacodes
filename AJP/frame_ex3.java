import java.awt.*;    
class frame_ex3 {    
 frame_ex3() {  
      Frame f = new Frame();
      Label l = new Label("Employee id:");
      Button b = new Button("Submit");
      TextField t = new TextField();
      l.setBounds(20, 80, 80, 30);  
      t.setBounds(20, 100, 80, 30);  
      b.setBounds(100, 100, 80, 30);   
      f.add(b);  
      f.add(l);  
      f.add(t);      
      f.setSize(400,300);  
      f.setTitle("Employee info");
      f.setLayout(null);    
      f.setVisible(true);  
}
public static void main(String args[]) {
frame_ex3 awt_obj = new frame_ex3();
}  

} 