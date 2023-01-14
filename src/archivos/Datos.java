/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;

/**
 *
 * @author emgl_
 */
public class Datos {
    private static boolean sesionIniciada;
    private static String ultimoError;

    public static boolean isSesionIniciada() {
        return sesionIniciada;
    }

    public static void setSesionIniciada(boolean sesionIniciada) {
        Datos.sesionIniciada = sesionIniciada;
    }

    public static String getUltimoError() {
        return ultimoError;
    }

    public static void setUltimoError(String ultimoError) {
        Datos.ultimoError = ultimoError;
    }
    
    
    
}
