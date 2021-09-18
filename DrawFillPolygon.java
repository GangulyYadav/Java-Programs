// Draw and fill polygon
import java.applet.Applet;
import java.awt.*;
public class DrawFillPolygon extends Applet{
 int xCoords[] = { 50, 200, 300, 150, 50, 50 };
 int yCoords[] = { 100, 0, 50, 300, 200, 100 };
 public void paint(Graphics g)
 {
  g.drawPolygon(xCoords, yCoords, 6);
  g.setColor(Color.blue);
  g.fillPolygon(xCoords, yCoords, 6);
 }
}
/* <applet code=DrawFillPolygon width=300 height=300>
  </applet>
*/