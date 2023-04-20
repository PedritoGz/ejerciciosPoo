package Servicio;

import Entidades.Banco;
import java.util.Scanner;

/**
 * @author pdrgo
 */
public class BancoServicio {

    Scanner leer = new Scanner(System.in);

    public Banco cuentaBancaria() {
        Banco b1 = new Banco();
        System.out.println("Ingresa tu numero de cuenta: ");
        b1.setNumCuenta(leer.next());
        System.out.println("Ingresa tu cedula: ");
        b1.setDni(leer.next());
        System.out.println("Ingresa tu Saldo: ");
        b1.setSaldo(leer.nextInt());
        return b1;
    }

    public void ingresar(Banco b1) {
        System.out.println("Ingresa el valor a depositar");
        b1.setSaldo(b1.getSaldo() + leer.nextInt());
    }
    public void retirar(Banco b1) {
        System.out.println("Ingresa el valor a retirar");
        b1.setSaldo(b1.getSaldo() - leer.nextInt());
    }
    public void retiroRapido(Banco b1) {
        System.out.println("Se va retirar un 20% de la cuenta");
        double retiroFast = b1.getSaldo()*0.2;
        b1.setSaldo(b1.getSaldo()-retiroFast);
    }
    public void consultarSaldo(Banco b1) {
        System.out.println(b1.getSaldo());
    }
    public void consultarDatos(Banco b1) {
        System.out.println(b1.getNumCuenta());
        System.out.println(b1.getDni());
        System.out.println(b1.getSaldo());
    }
}
