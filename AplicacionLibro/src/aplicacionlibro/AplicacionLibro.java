
package aplicacionlibro;

import Entidades.Libro;
import Servicio.LibroServicio;

/**
 * @author pdrgo
 */
public class AplicacionLibro {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      LibroServicio lb = new LibroServicio();
      Libro l1 = lb.ResLibro();
      lb.infoLibro(l1);
        
    }
    
}
