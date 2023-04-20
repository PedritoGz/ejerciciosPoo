package pesoapp;

import Entidades.Persona;
import Servicio.PersonaServicio;

public class PesoApp {

    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        Persona p1 = ps.crearPersona();
        Persona p2 = ps.crearPersona();
        Persona p3 = ps.crearPersona();
        Persona p4 = ps.crearPersona();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        int contPesoUno = 0;
        int contPesoCero = 0;
        int contPesoMUno = 0;
        int pVimc[] = new int[4];
        pVimc[0] = ps.calcularIMC(p1);
        pVimc[1] = ps.calcularIMC(p2);
        pVimc[2] = ps.calcularIMC(p3);
        pVimc[3] = ps.calcularIMC(p4);

        for (int i = 0; i < 4; i++) {
            switch (pVimc[i]) {
                case -1:
                    contPesoMUno++;
                    break;
                case 1:
                    contPesoUno++;
                    break;
                case 0:
                    contPesoCero++;
                    break;
                default:
                    break;
            }

        }

        System.out.println("Peso ideal = 0 | Sobrepeso = 1 | Bajo tu Peso = -1");
        System.out.println(p1.getNombre() + ": " + ps.calcularIMC(p1));
        System.out.println(p2.getNombre() + ": " + ps.calcularIMC(p2));
        System.out.println(p3.getNombre() + ": " + ps.calcularIMC(p3));
        System.out.println(p4.getNombre() + ": " + ps.calcularIMC(p4));

        //Porcentaje de peso 
        double porPesoUno = (contPesoMUno * 100) / 4;
        double porPesoDos = (contPesoUno * 100) / 4;
        double porPesoTres = (contPesoCero * 100) / 4;
        System.out.println("El porcentaje de pesos es: -1=%" + porPesoUno + " 1=%" + porPesoDos + " 0=%" + porPesoTres);

        boolean edadUno = ps.calcularEdad(p1);
        boolean edadDos = ps.calcularEdad(p2);
        boolean edadTres = ps.calcularEdad(p3);
        boolean edadCuatro = ps.calcularEdad(p4);

        System.out.println(p1.getNombre() + ": " + ps.calcularEdad(p1));
        System.out.println(p2.getNombre() + ": " + ps.calcularEdad(p2));
        System.out.println(p3.getNombre() + ": " + ps.calcularEdad(p3));
        System.out.println(p4.getNombre() + ": " + ps.calcularEdad(p4));

        //Porcentaje P. Mayores 
        int contPMay = 0;
        int PMay = 4;

        if (ps.calcularEdad(p1)) {
            contPMay++;
        }
        if (ps.calcularEdad(p2)) {
            contPMay++;
        }
        if (ps.calcularEdad(p3)) {
            contPMay++;
        }
        if (ps.calcularEdad(p4)) {
            contPMay++;
        }

        int normalMayor = 0;
        int normalMenor = 0;
        int pasadoMayor = 0;
        int pasadoMenor = 0;
        int bajoMayor = 0;
        int bajoMenor = 0;
        boolean perEdad[] = new boolean[4];
        perEdad[0] = ps.calcularEdad(p1);
        perEdad[1] = ps.calcularEdad(p2);
        perEdad[2] = ps.calcularEdad(p3);
        perEdad[3] = ps.calcularEdad(p4);

        for (int i = 0; i < 4; i++) {
            if (perEdad[i] && (pVimc[i] == 0)) {
                normalMayor++;
            } else {
                normalMenor++;
            }
            if (perEdad[i] && (pVimc[i] == 1)) {
                pasadoMayor++;
            } else {
                pasadoMenor++;
            }
            if (perEdad[i] && (pVimc[i] == -1)) {
                bajoMayor++;
            } else {
                bajoMenor++;
            }
        }
        double pnormalMayor = (normalMayor * 100) / 4;
        double pnormalMenor = (normalMenor * 100) / 4;
        double ppasadoMayor = (pasadoMayor * 100) / 4;
        double ppasadoMenor = (pasadoMenor * 100) / 4;
        double pbajoMayor = (bajoMayor * 100) / 4;
        double pbajoMenor = (bajoMenor * 100) / 4;
        
        System.out.println("Mayores peso normal: %"+pnormalMayor);
        System.out.println("Menores peso normal: %"+pnormalMenor);
        System.out.println("Mayores sobrepeso: %"+ppasadoMayor);
        System.out.println("Menores sobrepeso: %"+ppasadoMenor);
        System.out.println("Mayores peso bajo: %"+pbajoMayor);
        System.out.println("Menores peso bajo: %"+pbajoMenor);
        
        

        double porPMayores = (contPMay * 100) / PMay;
        System.out.println("El porcentaje de personas mayores es de: " + porPMayores);

    }

}
