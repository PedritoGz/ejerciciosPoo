package Servicio;

import Entidades.frase;
import java.util.Arrays;

public class FraseServicio {

    frase fr = new frase();

    public void llenadoA(frase fr) {
        int[] arregloA = new int[50];
        System.out.println("Vector A:");
        for (int i = 0; i < 50; i++) {
            arregloA[i] = (int) Math.round(((Math.random() * 50)));
        }
        fr.setA(arregloA);
        for (int i = 0; i < 50; i++) {
            System.out.print("(" + fr.getA()[i] + ")");
        }
        System.out.println("");
    }

    public void ordenarA(frase fr) {
        System.out.println("Vector A ordenado hasta el n=10");
        Arrays.sort(fr.getA());
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + fr.getA()[i] + "]");
        }
        System.out.println("");

    }

    public void llenadoB(frase fr) {
        System.arraycopy(fr.getA(), 0, fr.getB(), 0, 10);
        Arrays.fill(fr.getB(), 10, 20, 12);
        System.out.println("Vector B: ");
        for (int i = 0; i < 20; i++) {
            System.out.print("[" + fr.getB()[i] + "]");
        }
    }

}
