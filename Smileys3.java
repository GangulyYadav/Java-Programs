import java.awt.*;
import java.applet.*;
public class Smileys3 extends Applet
{
 public void paint(Graphics g)
{
  g.drawOval(40,40,120,150);
  g.drawOval(57,75,30,20);
  g.drawOval(110,75,30,20);
  g.fillOval(68,81,10,10);
  g.fillOval(120,81,10,10);
  g.drawOval(57,75,30,20);
  g.fillArc(60,125,80,40,180,180);
  g.drawOval(25,92,15,30);
  g.drawOval(160,92,15,30);
}
}
//<applet code="Smileys3.class" height=300 width=300></applet>