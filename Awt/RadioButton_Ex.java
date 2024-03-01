import java.awt.*;
public class RadioButton_Ex
{
	public RadioButton_Ex() {
		Frame f = new Frame("Checkbox Example");
		CheckboxGroup obj = new CheckboxGroup();
		Checkbox RadioButton_Ex = new Checkbox("JAVA",false,obj);
		Checkbox checkbox2 = new Checkbox("NAD",false,obj);
		Checkbox checkbox3 = new Checkbox("PHP",false,obj);
		Checkbox checkbox4 = new Checkbox("ISE",false,obj);

		f.add(RadioButton_Ex);
		f.add(checkbox2);
		f.add(checkbox3);
		f.add(checkbox4);

		f.setSize(400,400);
		f.setLayout(new GridLayout(2,2));
		f.setVisible(true);
	}
	public static void main (String args[]) {
		new RadioButton_Ex();
	}
}