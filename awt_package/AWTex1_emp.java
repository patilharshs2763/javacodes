import java.awt.*;
class AWTex1_emp{
	AWTex1_emp(){
		Frame f= new Frame();
		Label l=new Label("Emp ID:");
		Button b=new Button("Submit");
		TextField t=new TextField();
		
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
		AWTex1_emp awt_obj=new AWTex1_emp();
	}
}