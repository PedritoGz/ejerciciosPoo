
package calculadoraapp;

import Entidades.Calculadora;
import Servicio.CalculadoraServicio;

/**
 * @author pdrgo
 */
public class CalculadoraAPP {

    public static void main(String[] args) {
        CalculadoraServicio cs = new CalculadoraServicio();
        Calculadora c1 = cs.crearOperacion();
        cs.sumar(c1);
        cs.restar(c1);
        cs.divi(c1);
        cs.multi(c1);
    }
    
}
