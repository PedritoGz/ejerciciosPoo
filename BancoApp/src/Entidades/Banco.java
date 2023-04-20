package Entidades;

/**
 * @author pdrgo
 */
public class Banco {
    private String numCuenta;
    private String dni;
    private double saldo;

    public Banco() {
    }

    public Banco(String numCuenta, String dni, double saldo) {
        this.numCuenta = numCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
