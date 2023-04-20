package Servicio;

import Entidades.Raiz;
import java.util.Scanner;

public class RaizServicio {

    Scanner sc = new Scanner(System.in);
    Raiz r1 = new Raiz();

    public Raiz crearEq() {
        System.out.println("Llenemos la Ecuacion ax² + bx + c");
        System.out.print("Ingresa el coeficiente a:");
        r1.setA(sc.nextDouble());
        System.out.print("Ingresa el coeficiente b:");
        r1.setB(sc.nextDouble());
        System.out.print("Ingresa el coeficiente c:");
        r1.setC(sc.nextDouble());
        return r1;
    }

    public double discriminante() {
        double D;
        D = (Math.pow(r1.getB(), 2)) - (4 * r1.getA() * r1.getC());
        return D;

    }

    public boolean tieneRaices() {
        return (discriminante() >= 0);
    }

    public boolean tieneRaiz() {
        return (discriminante() == 0);
    }

    public void obtenerRaices() {
        double x1 = ((-r1.getB()) - Math.sqrt(discriminante())) / (2 * r1.getA());
        double x2 = ((-r1.getB()) + Math.sqrt(discriminante())) / (2 * r1.getA());
        System.out.println("Raiz 1: " + x1);
        System.out.println("Raiz 2: " + x2);
    }

    public void obtenerRaiz() {
        double x1 = ((-r1.getB()) - Math.sqrt(discriminante())) / (2 * r1.getA());
        System.out.println("Raiz 1: " + x1);
    }

    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("La ecuación no tiene solución real.");
        }
    }

}

/*Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
 Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b            */
