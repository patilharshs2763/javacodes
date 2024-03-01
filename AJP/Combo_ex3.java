import javax.swing.*;    
public class Combo_ex3 {    
JFrame f;    
Combo_ex3(){    
    f=new JFrame("ComboBox Example");
	JLable l=new JLable();
	l.setSize(100,100);
	JButton b=new JButton("Show");
    String country[]={"India","Aus","U.S.A","England","Newzealand"};        
    JComboBox cb=new JComboBox(country);    
    cb.setBounds(50, 50,90,20);    
    f.add(cb);
	f.add(l);
	f.add(b);
    f.setLayout(null);    
    f.setSize(400,500);    
    f.setVisible(true);
		b.addActionListner(new addActionListner(){
		public void actionPerformed(ActionEvent e) {       
		String data = "Programming language Selected: "+ cb.getItemAt(cb.getSelectedIndex());  
l.setText(data);  
}  
});
		}
}    
public static void main(String[] args) {    
    new Combo_ex3();         
}    
} 