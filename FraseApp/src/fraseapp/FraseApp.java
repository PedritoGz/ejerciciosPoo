package fraseapp;

import Entidades.Frase;
import Funcion.FraseFuncion;

public class FraseApp {

    public static void main(String[] args) {
        //
        FraseFuncion ff = new FraseFuncion();
        Frase f1 = ff.creaarFrase();
        ff.mostrarVocales(f1);
        ff.invertirFrase(f1);
        ff.vecesRepetido(f1);
        ff.compararLongitud(f1);
        ff.unirFrases(f1);
        ff.remplazar(f1);
        ff.contiene(f1);
    }

}
