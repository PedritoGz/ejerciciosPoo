package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 * @author pdrgo
 */
public class RectanguloServicio {

    Scanner leer = new Scanner(System.in);

    public Rectangulo creadorRectangulo() {
        Rectangulo r1 = new Rectangulo();
        System.out.println("Ingresa la base");
        r1.setBase(leer.nextInt());
        System.out.println("Ingresa la altura");
        r1.setAlto(leer.nextInt());

        return r1;
    }

    public void area(Rectangulo r1) {
        r1.setArea(r1.getAlto() * r1.getBase());
        System.out.println("Area: " + r1.getArea());
    }

    public void perimetro(Rectangulo r1) {
        r1.setPerimetro((r1.getAlto() + r1.getBase()) * 2);
        System.out.println("Perimetro: " + r1.getPerimetro());
    }

    public void dibujo(Rectangulo r1) {
        System.out.println("Dibujo");
        for (int i = 0; i < r1.getAlto(); i++) {
            for (int j = 0; j < r1.getBase(); j++) {
                if (i == 0 || j == 0 || (i == (r1.getAlto() - 1)) || (j == (r1.getBase() - 1))) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

}
