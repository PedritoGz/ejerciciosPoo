
package calculadoracirculo;

import Entidades.Circulo;
import Servicio.CirculoServicio;

/**
 * @author pdrgo
 */
public class CalculadoraCirculo {

    public static void main(String[] args) {
        CirculoServicio cs = new CirculoServicio();
        Circulo c1 = cs.crearCircunferencia();
        cs.radioCirculo(c1);
        cs.area(c1);
        cs.perimetro(c1);
        
        
    }
    
}
