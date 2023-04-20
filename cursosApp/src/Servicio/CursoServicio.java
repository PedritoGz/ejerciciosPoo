package Servicio;

import Entidades.Curso;
import java.util.Scanner;

public class CursoServicio {

    Scanner sc = new Scanner(System.in);

    public Curso crearCurso() {
        Curso c1 = new Curso();
        System.out.println("Ingresa el nombre del curso");
        c1.setNombreCurso(sc.next());
        System.out.println("Ingresa la cantidad de dias");
        c1.setCantidadDias(sc.nextInt());
        System.out.println("Ingresa la cantidad de Horas por dia");
        c1.setCantidadHoras(sc.nextInt());
        System.out.println("Ingresa el turno(M o T)");
        char cT = sc.next().charAt(0);
        while (cT != 'M' && cT != 'T') {
            System.out.println("Incorrecto ingresa M o T");
            cT = sc.next().charAt(0);
        }
        System.out.println("Ingresa el precio de la Hora: ");
        c1.setPrecioHora(sc.nextDouble());
        String[] est = cargarAlumnos();
        c1.setAlumnos(est);
        return c1;
    }

    public String[] cargarAlumnos() {
        System.out.print("Ingresa la cantidad de Alumnos:");
        int numE = sc.nextInt();
        String[] est = new String[numE];
        for (int i = 0; i < numE; i++) {
            System.out.println("Escribe el nombre del estudiante " + (i + 1) + ": ");
            est[i] = sc.next();
        }
        return est;
    }

    public void calcularGanancia(Curso c1) {
        double ganancia;
        ganancia = c1.getCantidadHoras() * c1.getCantidadDias() * c1.getPrecioHora() * c1.getAlumnos().length;
        System.out.println("Las ganancias totales: " + ganancia);
    }

}
