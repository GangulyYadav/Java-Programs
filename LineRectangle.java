import java.awt.*;

import java.applet.*;

public class LineRectangle extends Applet
{

  public void paint(Graphics g)
{

  g.setColor(Color.red);

  g.drawLine(20,20,500,20);

  g.setColor(Color.yellow);

  g.drawRect(20,40,200,40);

  g.fillRect(300,100,200,40);

}

}

/*<applet code="LineRectangle.class" height=300  width=300>

</applet>

*/
