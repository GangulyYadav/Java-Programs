import java.awt.*;

import java.applet.*;



public class Olympics extends Applet
{

     public void paint(Graphics g)
{

             g.setColor(Color.BLUE);

             g.drawOval(90, 90, 90, 90);

             g.setColor(Color.YELLOW);

             g.drawOval(150, 135, 90, 90);

             g.setColor(Color.BLACK);
 
             g.drawOval(210, 90, 90, 90);

             g.setColor(Color.GREEN);

             g.drawOval(270, 135, 90, 90);

             g.setColor(Color.RED);

             g.drawOval(330, 90, 90, 90);

          }

}

/*
<applet code ="Olympics.class" width ="500" height ="500">
</applet>
*/