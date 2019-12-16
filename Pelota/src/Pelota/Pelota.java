package Pelota;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class Pelota extends MIDlet implements CommandListener{
    
    Display Pantalla;
    LEL Pelota;
    Command Salir;
    
    public Pelota(){
        Pantalla=Display.getDisplay(this);
        Pelota=new LEL();
        Salir=new Command("Salir", Command.EXIT, 1);
        Pelota.addCommand(Salir);
        Pelota.setCommandListener(this);
    }

    public void startApp() {
        Pantalla.setCurrent(Pelota);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command c, Displayable d) {
        if(c==Salir){
            destroyApp(true);
            notifyDestroyed();
        }
    }
}
