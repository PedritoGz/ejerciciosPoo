
package Servicio;

import Entidades.Libro;
import java.util.Scanner;

/**
 * @author pdrgo
 */

public class LibroServicio {
    
    public Libro ResLibro(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Libro l1 = new Libro();
        System.out.println("Ingresa el Codigo del libro");
        l1.setIsbn(leer.next());
        System.out.println("Ingresa el autor del libro");
        l1.setAutor(leer.next());
        System.out.println("Ingresa el titulo del libro");
        l1.setTitulo(leer.next());
        System.out.println("Ingresa la candidad de pag del libro");
        l1.setPag(leer.nextInt());
        
        return l1;
  
    }
    public void infoLibro (Libro l1){
        System.out.println(l1.getIsbn()+" Titulo: "+l1.getTitulo()+" Autor: "+l1.getAutor()); 
        System.out.println("La cantidad de pag que tiene el libro son: "+l1.getPag());
    }
}
