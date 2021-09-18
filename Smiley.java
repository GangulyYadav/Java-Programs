import java.awt.*;

import java.applet.*;
public class Smiley extends Applet
{

     public void paint(Graphics g)
{

	    g.setColor(Color.yellow);
           
 g.fillOval(80, 70, 150, 150);

            g.setColor(Color.BLACK);

            g.fillOval(120, 125, 15, 15);

            g.fillOval(170, 125, 15, 15);
 
            g.drawArc(130, 180, 50, 20, 180, 180);
 
         }

}

/*
<applet code ="Smiley.class" width ="300" height ="300">
</applet>
*/