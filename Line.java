// Java program to draw line and rectangle
import java.awt.*;
import java.applet.Applet;
public class Line extends Applet{
    public void paint(Graphics g){
	g.drawLine(30,30,100,30);
	g.drawRect(30,40,100,70);
    }
}
//<applet code="Line.class" height=300 width=300></applet>