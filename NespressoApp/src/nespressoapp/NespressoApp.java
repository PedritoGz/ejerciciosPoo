package nespressoapp;

import Entidades.Cafetera;
import Utilidad.UtilidadCafetera;
import java.util.Scanner;

/**
 * @author pdrgo
 */
public class NespressoApp {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        UtilidadCafetera uc = new UtilidadCafetera();
        Cafetera c1 = uc.infoCafetera();
        boolean salir = false;
        do {
            System.out.println("NESPRESSO");
            System.out.println("1.Llenado del deposito ");
            System.out.println("2.Vaciar deposito");
            System.out.println("3.Servir Taza");
            System.out.println("4.Agregar Cafe al deposito");
            System.out.println("5.Salir");
            System.out.print("Elige una opcion: ");
            int numU = leer.nextInt();

            switch (numU) {
                case 1:
                    uc.llenarCafetera(c1);
                    break;
                case 2:
                    uc.vaciarCafetera(c1);
                    break;
                case 3:
                    uc.servirTaza(c1);
                    break;
                case 4:
                    uc.agregarCafe(c1);
                    break;
                case 5:
                    System.out.println("Gracias vuelve pronto");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        } while (!salir);

    }

}
