package MOV;

import javax.microedition.midlet.*; 
import javax.microedition.lcdui.*; 
import javax.microedition.media.*;

public class MoverImagen extends MIDlet{
    
    private Imagen panCanvas; 
    private Display pantalla; 
    
    public MoverImagen(){ 
        pantalla =Display.getDisplay(this); 
        panCanvas=new Imagen(this); 
    } 
    
    public void startApp() { 
        pantalla.setCurrent(panCanvas); 
    } 
    
    public void pauseApp() { 
    } 
    
    public void destroyApp(boolean uncond) { 
    } 
    
    public void salir(){ 
        destroyApp(false); 
        notifyDestroyed(); 
    } 
}