package Servicio;

import Entidades.Edad;
import java.util.Date;
import java.util.Scanner;

public class EdadServicio {

    Scanner sc = new Scanner(System.in);

    public Edad crearPersona() {
        Edad e1 = new Edad();
        System.out.println("Ingresa el Nombre: ");
        e1.setNombre(sc.next());
        System.out.println("Ingresa la fecha de nacimiento");
        System.out.print("Dia: ");
        int d = sc.nextInt();
        System.out.print("Mes: ");
        int m = sc.nextInt();
        System.out.print("Año: ");
        int a = sc.nextInt();
        Date fecha = new Date(a - 1900, m - 1, d);
        e1.setFecha(fecha);
        return e1;
    }

    public int calcularEdad(Edad e1) {
        Date fechaActual = new Date();
        long diferencia = fechaActual.getTime() - e1.getFecha().getTime();
        int anios = (int) (diferencia / (1000 * 60 * 60 * 24 * 365L));
        return anios;
    }

    public void resEdad(Edad e1) {
        System.out.println(e1.getNombre());
        System.out.println("Tu edad es: " + calcularEdad(e1));

    }

    public void menorQ(Edad e1) {
        System.out.println("Ingresa una Edad para comparar");
        int anios = calcularEdad(e1);
        int edadB = sc.nextInt();
        boolean menor = edadB < anios;
        System.out.println("Tu edad es menor que la ingresada: " + menor);
    }

}
