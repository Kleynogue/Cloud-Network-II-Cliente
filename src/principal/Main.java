package principal;

import gui.InicioCliente;
import java.io.IOException;
import java.net.UnknownHostException;

/**
 *
 * @author emgl_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException, IOException {
        InicioCliente inicio = new InicioCliente();
        inicio.setVisible(true);
    }   
}
