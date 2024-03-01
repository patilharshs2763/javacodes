//c.Write an applet program that accepts two input, strings using tag and concatenate the strings and display it in status Window.
import java.applet.*; 
import java.awt.*; 
public class param_ex extends Applet 
{
	String str1;
	public void init()
	{
		str1 = getParameter("str1").concat(getParameter("str2"));
	}
	public void paint(Graphics g)
	{
		//showStatus(str1);
		g.drawString(str1,100,100);
	}
}
/*<applet code = param_ex.class height = 400 width = 400> 
<param name = "str1" value = "Param "> 
<param name = "str2" value = "Example"> 
</applet>*/