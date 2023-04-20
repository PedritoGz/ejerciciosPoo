package Servicio;

import Entidades.Calculadora;
import java.util.Scanner;

/**
 * @author pdrgo
 */
public class CalculadoraServicio {

    Scanner leer = new Scanner(System.in);

    public Calculadora crearOperacion() {

        Calculadora c1 = new Calculadora();

        System.out.println("Ingresa el primer numero");
        c1.setNumero1(leer.nextDouble());
        System.out.println("Ingresa el segundo numero");
        c1.setNumero2(leer.nextDouble());

        return c1;
    }

    public void sumar(Calculadora c1) {
        c1.setSum(c1.getNumero1() + c1.getNumero2());
        System.out.println("Suma: " +c1.getSum());
    }

    public void restar(Calculadora c1) {
        c1.setRes(Math.max(c1.getNumero1(),c1.getNumero2())-Math.min(c1.getNumero1(),c1.getNumero2()));
        System.out.println("Resta: " + c1.getRes());
    }

    public void multi(Calculadora c1) {
        if (c1.getNumero1() == 0 || c1.getNumero2() == 0) {
            System.out.println("*Error* el resultado es 0");
        } else {
            c1.setMul(c1.getNumero1() * c1.getNumero2());
            System.out.println("Multiplicación: " + c1.getMul());
        }

    }

    public void divi(Calculadora c1) {
        if (c1.getNumero1() == 0 || c1.getNumero2() == 0) {
            System.out.println("*Error*");
        } else {
            c1.setDiv(Math.max(c1.getNumero1(),c1.getNumero2())/Math.min(c1.getNumero1(),c1.getNumero2()));
            System.out.println("División: " + c1.getDiv());
        }
    }
}
