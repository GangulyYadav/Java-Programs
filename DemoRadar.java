import java.awt.*;
import java.applet.*;
public class DemoRadar extends Applet implements Runnable{
   Thread radar=null;
   int x=90;
   private Image dbImage;
   private Graphics dbg;
   public void start(){
      setBackground(Color.darkGray);
         if(radar== null) {
            radar= new Thread(this, "DemoRadar");
            radar.start();
        }
   }
   public void run(){
      Thread go = Thread.currentThread();
      while(true){
              try{
                  if (x == 360){
                        x = 0;
                  }
                  else{
                        x+=1;
                  }
            Thread.sleep(30);
            repaint();
         }
         catch(InterruptedException e){}
      }
   }

         public void update (Graphics2D g2)
         {
               // DoubleBuffering
               if (dbImage == null)
               {
                     dbImage = createImage (this.getSize().width, this.getSize().height);
                     dbg = dbImage.getGraphics ();
               }

               dbg.setColor (getBackground ());
               dbg.clearRect (0, 0, this.getSize().width, this.getSize().height);

               dbg.setColor (getForeground());
               paint (dbg);

               g2.drawImage (dbImage, 0, 0, this);
         }

   public void paint(Graphics g){
      int sx = this.getWidth()/2;
      int sy = this.getHeight()/2;
      int xE = (int)(Math.sin(x)*100)+sx;
      int yE = (int)(Math.cos(x)*100)+sy;


      Graphics2D g2 = (Graphics2D) g;
      g2.setColor(Color.green);
      g2.drawOval(sx-100,sy-100,200,200);
      g2.drawLine(sx, sy, xE, yE);
   }
}
/* <applet code="DemoRadar.class" width="200" height="200"> */