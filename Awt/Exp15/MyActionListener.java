import java.awt.*;
import java.awt.event.*;
public class MyActionListener implements ActionListener{
public void actionPerformed(ActionEvent ev){
System.out.println(ev.getSource());
MenuItem item = (MenuItem)(ev.getSource());
if(item.getLabel().equals("Open")){
System.out.println("You clicked on Open");
}
else if(item.getLabel().equals("Save")){
System.out.println("You clicked on Save");
}
else if(item.getLabel().equals("Close")){
System.out.println("You clicked on Close");
}
else if(item.getLabel().equals("Save All")){
System.out.println("You clicked on Save All");
}
else if(item.getLabel().equals("Close All")){
System.out.println("You clicked on Close All");
}
else if(item.getLabel().equals("Exit")){
System.out.println("You clicked on Exit");
System.exit(0);
}
}
}