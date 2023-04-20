package arregloapp;

import Entidades.frase;
import Servicio.FraseServicio;

public class ArregloApp {
    
    public static void main(String[] args) {
        frase fr = new frase();
        FraseServicio fs = new FraseServicio();        
        
        fs.llenadoA(fr);
        fs.ordenarA(fr);
        fs.llenadoB(fr);
        
    }
    
}
