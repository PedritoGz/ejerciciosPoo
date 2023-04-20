package Entidades;

/**
 * @author pdrgo
 */
public class Rectangulo {

    private int base;
    private int alto;
    private int area;
    private int perimetro;

    public Rectangulo() {
    }

    public Rectangulo(int base, int alto, int area, int perimetro) {
        this.base = base;
        this.alto = alto;
        this.area = area;
        this.perimetro = perimetro;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

}
