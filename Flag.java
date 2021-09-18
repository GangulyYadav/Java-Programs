import java.applet.*;
import java.awt.*;
public class Flag extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawOval(10,35,10,10);
        g.drawLine(10,40,10,800);
        g.drawLine(19,40,19,800);
        g.drawLine(370,40,370,290);
        g.setColor(Color.orange);
        g.fillRect(20,40,350,80);
        g.setColor(Color.blue);
        int l=0;
        int x=195,y=165;
        double x1,y1;
        double d;
        g.drawOval(150,120,90,90);
        for(int i=1;i<=24;i++){
            d=(double)l*3.14/180.0;
            x1=x+(double)42*Math.cos(d);
            y1=y+(double)42*Math.sin(d);
            g.drawLine(x,y,(int)x1,(int)y1);
            l=l+(360/24);
        }
        g.setColor(Color.green);
        g.fillRect(20,211,350,80);
    }
}

//<applet code="Flag.class" width="300" height="300"> </applet>
