package Megaman;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class Megaman extends MIDlet implements CommandListener{

    Display Pantalla;
    Draw x;
    Command Salir;
    
    public Megaman(){
        Pantalla=Display.getDisplay(this);
        x=new Draw();
        Salir=new Command("Salir", Command.EXIT, 1);
        x.addCommand(Salir);
        x.setCommandListener(this);
    }
    
    public void startApp() {
        Pantalla.setCurrent(x);
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
