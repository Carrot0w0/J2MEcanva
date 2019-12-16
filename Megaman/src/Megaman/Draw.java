package Megaman;

import javax.microedition.lcdui.*;

public class Draw extends Canvas{

    Image MM;
    Megaman ME;
    
    public Draw(Megaman mid){
        try{
            MM=Image.createImage("Megaman1.png");
        }catch(Exception x){}
        this.ME=mid;
    }
    
    protected void paint(Graphics g) {
        g.setColor(255, 0, 0);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        g.drawImage(MM, getWidth()/2, getHeight()/2, Graphics.BASELINE|Graphics.HCENTER);
    }   
    
}
