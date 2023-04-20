package Servicio;

import Entidades.Numero;

public class NumeroServicio {

    public double devolverMayor(Numero num1) {
        return Math.round(Math.max(num1.getNumUno(), num1.getNumDos()));
    }

    public double devolverMenor(Numero num1) {
        return Math.round(Math.min(num1.getNumUno(), num1.getNumDos()));
    }

    public double calcularPotencia(Numero num1) {
        return Math.pow(devolverMayor(num1), devolverMenor(num1));
    }

    public double calculaRaiz(Numero num1) {
        return Math.sqrt(devolverMenor(num1));
    }

    public Numero llamar(Numero num1) {
        System.out.println("Num Mayor: " + devolverMayor(num1));
        System.out.println("Num Menor: " + devolverMenor(num1));
        System.out.println("Num Mayor elevado al menor: " + calcularPotencia(num1));
        System.out.println("Raiz Num Menor: " + calculaRaiz(num1));
        return num1;
    }

}
