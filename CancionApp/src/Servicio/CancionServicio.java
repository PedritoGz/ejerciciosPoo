package Servicio;

import Entidades.Cancion;
import java.util.Scanner;

public class CancionServicio {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Cancion c1 = new Cancion();
    
    public Cancion crearSong() {
        System.out.println("Ingresa el titulo de la Cancion");
        c1.setTitulo(sc.next());
        System.out.println("Ingresa el autor de la Cancion");
        c1.setAutor(sc.next());
        return c1;
    }
    
}

/*Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.*/
