package Servicio;

import Entidades.Punto;
import java.util.Scanner;

public class PuntoServicio {

    Scanner sc = new Scanner(System.in);
    Punto p1 = new Punto();

    public Punto crearPuntos() {
        System.out.println("Ingresa el primer punto (x1;x2)");
        System.out.print("x1: ");
        p1.setX1(sc.nextDouble());
        System.out.print("x2: ");
        p1.setX2(sc.nextDouble());
        System.out.println("Ingresa el segundo punto (y1;y2)");
        System.out.print("y1: ");
        p1.setY1(sc.nextDouble());
        System.out.print("y2: ");
        p1.setY2(sc.nextDouble());
        return p1;
    }

    public void distanciaPuntos() {
        double X;
        X = Math.sqrt((Math.pow(p1.getX2() - p1.getX1(), 2)) + (Math.pow(p1.getY2() - p1.getY1(), 2)));
        System.out.println("La distancia es: " + X);
    }

}

/*Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
d=√((x_2-x_1)²+(y_2-y_1)²)*/
