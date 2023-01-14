/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import modelo.Mensaje;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emgl_
 */
public class Client {
    public static void enviarMensaje(Mensaje mensaje, String ipServidor, int puerto){
        try {
            Socket socket = new Socket(ipServidor, puerto);
            ObjectOutputStream mensajeDatos = new ObjectOutputStream(socket.getOutputStream());
            mensajeDatos.writeObject(mensaje);
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
