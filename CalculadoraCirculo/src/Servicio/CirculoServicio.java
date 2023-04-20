
package Servicio;

import Entidades.Circulo;
import java.util.Scanner;

/**
 * @author pdrgo
 */
public class CirculoServicio {
    Scanner leer = new Scanner(System.in);
    
    public Circulo crearCircunferencia(){
        Circulo c1 = new Circulo();
        System.out.print("Ingresa el radio del circulo");
        c1.setRadio(leer.nextDouble());
        return c1;
    }
    public void radioCirculo(Circulo c1){
        System.out.println("Radio: "+c1.getRadio());
    }
    public void area(Circulo c1){
        c1.setArea((c1.getRadio()*c1.getRadio())*Math.PI);
        System.out.println("Area es igual: " + c1.getArea());
    }
    public void perimetro(Circulo c1){
        c1.setPerimetro(2 * c1.getRadio()* Math.PI);
        System.out.println("Perimetro es igual: " + c1.getPerimetro());
    }
}
