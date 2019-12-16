package MOV;

import javax.microedition.lcdui.*; 
import javax.microedition.media.*;
import javax.microedition.media.Control.*;
import java.io.*;

public class Imagen extends Canvas implements CommandListener { 
    
    private MoverImagen midlet; 
    private Image im; 
    private Command salir; 
    private int x, y; 
    private String MSG="Megaman";
    private Command p;
    
    public Imagen(MoverImagen mid){ 
        salir =new Command("Salir",Command.EXIT,1); 
        this.midlet= mid; 
        this.addCommand(salir);
        this.setCommandListener(this); 
        try{ 
            im = Image.createImage("Megaman2.png"); 
        } 
        catch (Exception e){ 
            System.out.println("Error al cargar archivo de imagen"); 
        } 
        x = getWidth()/2; 
        y = getHeight()-20; 
        p=new Command("Play", Command.OK, 1);
        this.addCommand(p);
    } 
    
    public void paint(Graphics g) { 
        g.setColor(255,0,0);
        g.fillRect(0,0,getWidth(),getHeight());
        g.drawImage(im,x,y,Graphics.BOTTOM|Graphics.HCENTER); 
        
        g.setColor(0, 0, 0);
        g.drawString(MSG, getWidth()/2, 50, Graphics.RIGHT|Graphics.BASELINE);
    } 
    
    protected void keyPressed(int keyCode) { 
        switch(getGameAction(keyCode)){ 
            case Canvas.DOWN: 
                if ((y+20)<getHeight()){ 
                    y=y+1;
                }
            break;  
            case Canvas.LEFT: 
                if (x > 0)
                    x = x-1;
            break;
            case Canvas.UP:
                if (y > 0){ 
                    try{
                        im=Image.createImage("Megaman1.png");
                    }catch(Exception x){}
                    y=y-1;
                }
            break;
            case Canvas.RIGHT:
                if ((x+20) < getWidth()){
                    try{
                        im=Image.createImage("Megaman3.png");
                    }catch(Exception x){}                    
                }  
            break;
        } 
        this.repaint(); 
    } 
    
    public void Play(){
        try{
            InputStream in = getClass().getResourceAsStream("/holo.mp3");
            Player q = Manager.createPlayer(in, "holo/x-mp3");
            q.start();
        }
        catch(Exception we){}
    }
    
    protected void keyRepeated(int keyCode){
        switch(getGameAction(keyCode)){ 
            case Canvas.DOWN: 
                if ((y+20)<getHeight()) 
                    y = y+1; 
            break;  
            case Canvas.LEFT: 
                if (x > 0)
                    x = x-1;
            break;
            case Canvas.UP:
                if (y > 0){ 
                    try{
                        im=Image.createImage("Megaman1.png");
                    }catch(Exception x){}
                    y=y-1;
                }
            break;
            case Canvas.RIGHT:
                if ((x+20) < getWidth()){
                    try{
                        im=Image.createImage("Megaman3.png");
                    }catch(Exception x){}
                    try{
                        im=Image.createImage("Megaman4.png");
                    }catch(Exception x){}
                    try{
                        im=Image.createImage("Megaman5.png");
                    }catch(Exception x){}
                }  
            break;
        } 
        this.repaint();
    }
    
    public void commandAction(Command c, Displayable d){
        if(c == salir){ 
            midlet.salir(); 
        } 
        if(c== p){
            Play();
        }
    } 
    
    protected void keyReleased(int keyCode){
        switch(getGameAction(keyCode)){ 
            case Canvas.DOWN: 
                if ((y+20)<getHeight()) 
                    y = y+1; 
            break;  
            case Canvas.LEFT: 
                if (x > 0)
                    x = x-1;
            break;
            case Canvas.UP:
                if (y > 0){ 
                    try{
                        im=Image.createImage("Megaman2.png");
                    }catch(Exception x){}
                    y=getHeight()-50;
                }
            break;
            case Canvas.RIGHT:
                if ((x+20) < getWidth()){
                    try{
                        im=Image.createImage("Megaman2.png");
                    }catch(Exception x){}
                } 
            break;
        } 
        this.repaint();
    }
} 