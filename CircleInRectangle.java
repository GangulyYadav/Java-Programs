// Java program to draw circle in a square
import java.awt.*;
import java.applet.Applet;
public class CircleInRectangle extends Applet{
    public void paint(Graphics g){
	g.drawRect(30,40,150,150);
	g.drawOval(30,40,150,150);
    }
}
//<applet code="CircleInRectangle.class" height=300 width=300></applet>