package edadapp;

import Entidades.Edad;
import Servicio.EdadServicio;

public class EdadApp {

    public static void main(String[] args) {
        EdadServicio ed = new EdadServicio();
        Edad e1 = ed.crearPersona();
        ed.calcularEdad(e1);
        ed.resEdad(e1);
        ed.menorQ(e1);

    }

}
