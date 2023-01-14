/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author emgl_
 */
public class ControlCampos {
    public static boolean estaVacio(String texto){
        boolean estaVacio=true;
        if(texto.length()!=0){
            estaVacio=false;
        }
        return estaVacio;
    } 
    
    public static boolean esEntero(String entrada) {
		for (int i = 0; i < entrada.length(); i++) {
			// Si alg�n d�gito no es un n�mero devolver� falso
			if (Character.isDigit(entrada.charAt(i)) == false) {
				return false;
			}
		}
		// Si logra completar el ciclo, devolver� verdadero
		return true;
	}

	// Devuelve el valor del String como entero en caso de ser un n�mero, si no,
	// devuelve -1
	public static int convertirAEntero(String entrada) {
		// Comprueba que sea n�mero y no sea vac�o
		if (ControlCampos.esEntero(entrada) && entrada.length() != 0) {
			// Si se cumple, devuelve el valor
			return Integer.parseInt(entrada);
		} else {
			// Si no se cumple, devuelve -1
			return -1;
		}
	}
}
