
package Entidades;

/**
 * @author pdrgo
 */
public class Calculadora {
    private double numero1;
    private double numero2;
    private double sum;
    private double res;
    private double mul;
    private double div;

    public Calculadora() {
    }

    public Calculadora(double numero1, double numero2, double sum, double res, double mul, double div) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.sum = sum;
        this.res = res;
        this.mul = mul;
        this.div = div;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public double getMul() {
        return mul;
    }

    public void setMul(double mul) {
        this.mul = mul;
    }

    public double getDiv() {
        return div;
    }

    public void setDiv(double div) {
        this.div = div;
    }
    
}
