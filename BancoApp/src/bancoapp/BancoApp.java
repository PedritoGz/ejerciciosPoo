package bancoapp;

import Entidades.Banco;
import Servicio.BancoServicio;
import java.util.Scanner;

/**
 * @author pdrgo
 */
public class BancoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        BancoServicio bs = new BancoServicio();
        Banco b1 = bs.cuentaBancaria();
        boolean salir = false;
        do {
            System.out.println("Menu Banco");
            System.out.println("1.Depositar");
            System.out.println("2.Retirar");
            System.out.println("3.Retiro Rapido");
            System.out.println("4.Saldo");
            System.out.println("5.Datos");
            System.out.println("6.Salir");
            int numU = leer.nextInt();

            switch (numU) {
                case 1:
                    bs.ingresar(b1);
                    break;
                case 2:
                    bs.retirar(b1);
                    break;
                case 3:
                    bs.retiroRapido(b1);
                    break;
                case 4:
                    bs.consultarSaldo(b1);
                    break;
                case 5:
                    bs.consultarDatos(b1);
                    break;
                case 6:
                    System.out.println("Sesion Cerrada");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        } while (!salir);

    }

}
