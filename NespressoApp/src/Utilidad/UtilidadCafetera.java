package Utilidad;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 * @author pdrgo
 */
public class UtilidadCafetera {

    Scanner leer = new Scanner(System.in);

    public Cafetera infoCafetera() {
        Cafetera c1 = new Cafetera(500, 200);
        return c1;
    }

    public void llenarCafetera(Cafetera c1) {
        c1.setCantidadActual(c1.getCapacidadMaxima());
        System.out.println("Se lleno la Cafetera (" + c1.getCantidadActual() + ")g");
    }

    public void vaciarCafetera(Cafetera c1) {
        c1.setCantidadActual(0);
        System.out.println("Se vacio la Cafetera (" + c1.getCantidadActual() + ")g");
    }

    public void agregarCafe(Cafetera c1) {
        System.out.println("Ingresa");
        int cafeAgregado = leer.nextInt();
        if (c1.getCantidadActual() == 500) {
            System.out.println("El deposito esta lleno");
        } else if (c1.getCantidadActual() + cafeAgregado >= 500) {
            c1.setCantidadActual(c1.getCapacidadMaxima());
            System.out.println("Se lleno el deposito");
        } else {
            c1.setCantidadActual(cafeAgregado + c1.getCantidadActual());
            System.out.println("Deposito actual (" + c1.getCantidadActual() + ")g");
        }
    }

    public void servirTaza(Cafetera c1) {
        System.out.println("Taza");
        System.out.println("1. Pequeña (4oz)");
        System.out.println("2. Mediana (6oz)");
        System.out.println("3. Grande (8oz)");
        System.out.print("Elige el tamaño: ");
        int numU = leer.nextInt();
        int tazaP = 113;
        int tazaM = 170;
        int tazaG = 226;
        switch (numU) {
            case 1:
                if (c1.getCantidadActual() >= tazaP) {
                    c1.setCantidadActual(c1.getCantidadActual() - tazaP);
                    System.out.println("Preparando Cafe Pequeño");
                    System.out.println("Deposito actual (" + c1.getCantidadActual() + ")g");
                } else {
                    System.out.println("No alcanza, se lleno solo " + c1.getCantidadActual());
                    c1.setCantidadActual(0);
                }
                break;

            case 2:
                if (c1.getCantidadActual() >= tazaM) {
                    c1.setCantidadActual(c1.getCantidadActual() - tazaM);
                    System.out.println("Preparando Cafe Pequeño");
                    System.out.println("Deposito actual (" + c1.getCantidadActual() + ")g");
                } else {
                    System.out.println("No alcanza, se lleno solo " + c1.getCantidadActual());
                    c1.setCantidadActual(0);
                    System.out.println("Deposito actual (" + c1.getCantidadActual() + ")g");
                }
                break;

            case 3:
                if (c1.getCantidadActual() >= tazaG) {
                    System.out.println("Preparando Cafe Pequeño");
                    c1.setCantidadActual(c1.getCantidadActual() - tazaG);
                    System.out.println("Deposito actual (" + c1.getCantidadActual() + ")g");
                } else {
                    System.out.println("No alcanza, se lleno solo " + c1.getCantidadActual());
                    c1.setCantidadActual(0);
                    System.out.println("Deposito actual (" + c1.getCantidadActual() + ")g");
                }
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;

        }
    }

}
