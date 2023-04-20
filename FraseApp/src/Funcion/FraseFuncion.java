package Funcion;

import Entidades.Frase;
import java.util.Scanner;

public class FraseFuncion {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Frase f1 = new Frase();

    public Frase creaarFrase() {
        System.out.println("Ingresa una Frase");
        f1.setPalabras(sc.nextLine());
        f1.setLongitud(f1.getPalabras().length());
        return f1;
    }

    public void mostrarVocales(Frase f1) {
        int contadorMV = 0;
        char letra[] = f1.getPalabras().toCharArray();
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < f1.getLongitud(); i++) {
            if (vocales.indexOf(letra[i]) != -1) {
                contadorMV++;
            }
        }
        System.out.println("Tiene: " + contadorMV + " vocales");
    }

    public void invertirFrase(Frase f1) {
        char letra[] = f1.getPalabras().toCharArray();
        for (int i = f1.getLongitud() - 1; i >= 0; i--) {
            System.out.print(letra[i]);
        }
        System.out.println("");
    }

    public void vecesRepetido(Frase f1) {
        System.out.print("Ingresa una letra para revisar repetición: ");
        char word = sc.next().charAt(0);
        char letra[] = f1.getPalabras().toCharArray();
        int contador = 0;
        for (int i = 0; i < f1.getLongitud(); i++) {
            if (letra[i] == word) {
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No se encontro similitud");
        } else {
            System.out.println("El caracter " + word + " ser repite " + contador + " veces");
        }
    }

    public void compararLongitud(Frase f1) {
        System.out.println("Ingresa una nueva frase para comparar");
        String nFrase = sc.next();
        if (nFrase.length() == f1.getLongitud()) {
            System.out.println("La longitud es igual");
        } else if (nFrase.length() >= f1.getLongitud()) {
            System.out.println("La longitud es mayor");
        } else if (nFrase.length() <= f1.getLongitud()) {
            System.out.println("La longitud es menor");
        }
    }

    public void unirFrases(Frase f1) {
        System.out.println("Ingresa una nueva para unirla");
        String unirFrase = sc.next();
        f1.setPalabras(f1.getPalabras().concat(" "+unirFrase));
        System.out.println(f1.getPalabras());
    }
    
    public void remplazar(Frase f1){
        System.out.println("Ingresa una letra para cambiarla por la 'a'");
        char nVocal = sc.next().charAt(0);
        f1.setPalabras(f1.getPalabras().replace('a', nVocal));
        System.out.println(f1.getPalabras());
    }
    
    public boolean contiene (Frase f1){
        boolean cVerdad = false;
        System.out.println("Ingresa una letra para comprobar: ");
        char letraU = sc.next().charAt(0);
        char letra[] = f1.getPalabras().toCharArray();
        int contador = 0;
        for (int i = 0; i < f1.getLongitud(); i++) {
            if (letra[i] == letraU) {
                contador++;
            }
        }
        if (contador != 0) {
            cVerdad = true;
        }
        System.out.println(cVerdad);
        return cVerdad;
    }
}
