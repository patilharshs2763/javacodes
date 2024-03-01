import java.awt.*;
public class frame_ex extends Frame
{
frame_ex(){
	//TextField t=new TextField();
	//t.setBounds(50, 120, 100, 50);
	//add(t);

	Button b = new Button("Button");
    b.setBounds(50,60,70,50);
	add(b);
	
	setSize(500,500);
	setLayout(null);   
	setVisible(true);
	}
	public static void main(String args[])
	{
		frame_ex f = new frame_ex();
	}  
}