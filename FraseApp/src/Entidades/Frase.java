package Entidades;

public class Frase {
    private String palabras;
    private int longitud;

    public Frase() {
    }
    
    public Frase(String palabras, int longitud) {
        this.palabras = palabras;
        this.longitud = longitud;
    }

    public String getPalabras() {
        return palabras;
    }

    public void setPalabras(String palabras) {
        this.palabras = palabras;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    
    
    
    
    
    
}
