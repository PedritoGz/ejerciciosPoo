
package Entidades;

/**
 * @author pdrgo
 */
public class Libro {
    
    private String isbn;
    private String titulo;
    private String autor;
    private int pag;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, int pag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.pag = pag;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPag() {
        return pag;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }
    
    
    
}
