/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import archivos.Datos;
import conexion.Cliente;
import conexion.Servidor;

/**
 *
 * @author emgl_
 */
public class ControlInicioSesion implements Runnable{
    private String nombreUsuario;
    private String clave;
    private String ipServidor;
    private int puerto;

    public ControlInicioSesion(String nombreUsuario, String clave, String ipServidor, int puerto) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.ipServidor = ipServidor;
        this.puerto = puerto;
    }
        
    @Override
    public void run() {
        iniciarSesion();
    }
    
    public void iniciarSesion(){
        String[] mensaje=new String[2];
        Datos.setUltimoError("///con");
        //Envia instruccion para inicio de sesión
        Cliente.enviarInstruccion("///ini", ipServidor, puerto);
        mensaje=Servidor.recibirInstruccion(puerto);
        System.out.println(mensaje[0]+" "+mensaje[1]);
        //Recibe respuesta del servidor
        if(mensaje[0].equals("///ini")){
            //Envia usuario
            Cliente.enviarInstruccion(nombreUsuario, ipServidor, puerto);
            mensaje=Servidor.recibirInstruccion(puerto);
            System.out.println(mensaje[0]+" "+mensaje[1]);
            //Recibe instruccion para enviar la clave
            if(mensaje[0].equals("///cla")){
                //Envia clave
                Cliente.enviarInstruccion(clave, ipServidor, puerto);
                mensaje=Servidor.recibirInstruccion(puerto);
                System.out.println(mensaje[0]+" "+mensaje[1]);
                //Recibe autorizacion de inicio de sesion
                if (mensaje[0].equals("///acc")){
                    Datos.setSesionIniciada(true);
                }else{
                    Datos.setUltimoError("///den");
                }
            }
        }
    }
}
