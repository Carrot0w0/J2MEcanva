package Juego;

import javax.microedition.lcdui.*;

public class Animacion extends Canvas{
    
    private Movimientos miSprite=new Movimientos(1); 
    
    public Animacion() { 
        miSprite.addFrame(1,"/Alizée/AlizeeS1.png");
        miSprite.on(); 
    }
    
    public void paint(Graphics g) { 
        g.setColor(0,255,255); 
        g.fillRect(0,0,getWidth(),getHeight()); 
        miSprite.setX(50); 
        miSprite.setY(50); 
        miSprite.draws(g); 
    } 
    
    public void keyPressed(int KeyCode){
        switch(KeyCode){
            case Canvas.LEFT:
                miSprite.selFrame(3);
                break;
        }
    }
}
