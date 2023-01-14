/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emgl_
 */
public class ControlTiempo implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(ControlTiempo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
