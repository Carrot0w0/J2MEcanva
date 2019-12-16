package Pelota;

import javax.microedition.lcdui.*;

public class LEL extends Canvas{
    
    int x=getWidth()/2-10, y=getHeight()/2-10, rojo=158;

    protected void paint(Graphics g) {
        g.setColor(255, 255, 255);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        g.setColor(rojo, 0, 0);
        g.fillArc(x, y, 20, 20, 0, 360);
    }
    
    public void keyPressed(int keyCode){
        switch(keyCode){
            case KEY_NUM2:
                if(y>0){
                    rojo=158;
                    y-=1;
                }
                else
                    rojo=255;
                break;
            case KEY_NUM8:
                if(y<getHeight()-20){
                    rojo=158;
                    y+=1;
                }
                else
                    rojo=255;
                break;
            case KEY_NUM4:
                if(x>0){
                    rojo=158;
                    x-=1;
                }
                else
                    rojo=255;
                break;
            case KEY_NUM6:
                if(x<getWidth()-20){
                    rojo=158;
                    x+=1;
                }
                else
                    rojo=255;
                break;
            case KEY_NUM1:
                if(x>0 && y>0){
                    rojo=158;
                    y-=1;
                    x-=1;
                }
                else
                    rojo=255;
                break;
            case KEY_NUM3:
                if(x<getWidth()-20 && y>0){
                    rojo=158;
                    y-=1;
                    x+=1;
                }
                else
                    rojo=255;
                break;
            case KEY_NUM7:
                if(x>0 && y<getHeight()-20){
                    rojo=158;
                    y+=1;
                    x-=1;
                }
                else
                    rojo=255;
                break;
            case KEY_NUM9:
                if(x<getWidth()-20 && y<getHeight()-20){
                    rojo=158;
                    y+=1;
                    x+=1;
                }
                else
                    rojo=255;
                break;
        }
        repaint();
    }
    
    public void keyRepeated(int keyCode){
        switch(keyCode){
            case KEY_NUM2:
                if(y>0){
                    rojo=158;
                    y-=5;
                }
                else
                    rojo=255;
                break;
            case KEY_NUM8:
                if(y<getHeight()-20){
                    rojo=158;
                    y+=5;
                }
                else
                    rojo=255;
                break;
            case KEY_NUM4:
                if(x>0){
                    rojo=158;
                    x-=5;
                }
                else
                    rojo=255;
                break;
            case KEY_NUM6:
                if(x<getWidth()-20){
                    rojo=158;
                    x+=5;
                }
                else
                    rojo=255;
                break;
            case KEY_NUM1:
                if(x>0 && y>0){
                    rojo=158;
                    y-=5;
                    x-=5;
                }
                else
                    rojo=255;
                break;
            case KEY_NUM3:
                if(x<getWidth()-20 && y>0){
                    rojo=158;
                    y-=5;
                    x+=5;
                }
                else
                    rojo=255;
                break;
            case KEY_NUM7:
                if(x>0 && y<getHeight()-20){
                    rojo=158;
                    y+=5;
                    x-=5;
                }
                else
                    rojo=255;
                break;
            case KEY_NUM9:
                if(x<getWidth()-20 && y<getHeight()-20){
                    rojo=158;
                    y+=5;
                    x+=5;
                }
                else
                    rojo=255;
                break;
        }
        repaint();
    }
}
