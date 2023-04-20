package calcuapp;

import Entidades.Numero;
import Servicio.NumeroServicio;

public class CalcuApp {

    public static void main(String[] args) {

        NumeroServicio ns = new NumeroServicio();
        Numero num1 = new Numero();
        Numero num2 = new Numero();
        num1.setNumUno(Math.random() * 10 + 1);
        System.out.println(num1.getNumUno());
        num1.setNumDos(Math.random() * 10 + 1);
        System.out.println(num1.getNumDos());
        ns.llamar(num1);
        

    }

}
