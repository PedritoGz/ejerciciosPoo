package Entidades;

public class Numero {

    private double numUno;
    private double numDos;

    public Numero() {
    }

    public Numero(double numUno, double numDos) {
        this.numUno = numUno;
        this.numDos = numDos;
    }

    public double getNumUno() {
        return numUno;
    }

    public void setNumUno(double numUno) {
        this.numUno = numUno;
    }

    public double getNumDos() {
        return numDos;
    }

    public void setNumDos(double numDos) {
        this.numDos = numDos;
    }

}
