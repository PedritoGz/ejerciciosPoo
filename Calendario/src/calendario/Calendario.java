package calendario;

import java.util.Date;
import java.util.Scanner;

public class Calendario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la fecha: ");
        System.out.print("dia: ");
        int d = sc.nextInt();
        System.out.print("mes: ");
        int m = sc.nextInt();
        System.out.print("año: ");
        int a = sc.nextInt();

        Date fecha = new Date(a - 1900, m - 1, d);
        System.out.println("La fecha que ingresaste es: " + fecha.toString());

        Date fechaActual = new Date();
        long diferencia = fechaActual.getTime() - fecha.getTime();
        System.out.println(diferencia);

        int anios = (int) (diferencia / (1000 * 60 * 60 * 24 * 365L));

        System.out.println("Hay " + anios + " años de diferencia.");

    }

}
