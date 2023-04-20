package calcurectanguloapp;

import Entidades.Rectangulo;
import Servicios.RectanguloServicio;

/**
 * @author pdrgo
 */
public class CalcuRectanguloAPP {

    public static void main(String[] args) {
        RectanguloServicio rs = new RectanguloServicio();
        Rectangulo r1 = rs.creadorRectangulo();
        rs.area(r1);
        rs.perimetro(r1);
        rs.dibujo(r1);
    }

}
