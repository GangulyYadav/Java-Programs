import java.applet.*;
import java.awt.*;

public class DrawPolygonApplet extends Applet {
  public void paint(Graphics g) {
    int xa[] = { 120, 125, 150, 150, 200, 200 };
    int ya[] = { 175, 100, 100, 175, 175, 200 };

    // draws a Polygon
    g.drawPolygon(xa, ya, 6);

  }
}
//<applet code = "DrawPolygonApplet.class" height = 300 width = 300></applet>