import java.awt.*;
import java.awt.event.*;
import java.io.*;
class menu{
public static void main(String[] args) {
MyFrame frame = new MyFrame();
}
}
class MyFrame extends Frame{
private MenuBar mb;
private Menu file;
private Menu edit;
private Menu view;
private Menu search;
private Menu tools;
private Menu help;
private MenuItem open, save, saveAll, close, closeAll, exit;
MyFrame(){
setVisible(true);
setSize(500,600);
init();
addComponents();
addingActions();
}
private void addingActions(){
ActionListener al = new MyActionListener();
open.addActionListener(al);
save.addActionListener(al);
saveAll.addActionListener(al);
close.addActionListener(al);
closeAll.addActionListener(al);
exit.addActionListener(al);
}
private void addComponents(){
setMenuBar(mb);
mb.add(file);
mb.add(edit);
mb.add(view);
mb.add(search);
mb.add(tools);
mb.add(help);
// adding items to menu file
file.add(open);
file.add(save);
file.add(saveAll);
file.add(close);
file.add(closeAll);
file.add(exit);
}
private void init(){
mb = new MenuBar();
file = new Menu("File");
edit = new Menu("Edit");
view = new Menu("View");
search = new Menu("Search");
tools = new Menu("Tools");
help = new Menu("Help");
open = new MenuItem("Open");
save = new MenuItem("Save");
saveAll = new MenuItem("Save All");
close = new MenuItem("Close");
closeAll = new MenuItem("Close All");
exit = new MenuItem("Exit");
}
}