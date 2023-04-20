package Servicio;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    public Persona crearPersona() {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Introduzca el Nombre:");
        String nombre = sc.nextLine();
        System.out.println("Introduzca la edad:");
        int edad = sc.nextInt();
        System.out.println("Introduzca su sexo(H|M|O):");
        char sexo = sc.next().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.print("Sexo incorrecto. Introduce el sexo (H, M, O): ");
            sexo = sc.next().charAt(0);
        }
        System.out.println("Introduzca su peso:");
        double peso = sc.nextDouble();
        System.out.println("Introduzca la altura:");
        double altura = sc.nextDouble();
        return new Persona(nombre,edad,sexo,peso,altura);       
    }
    
    public int calcularIMC(Persona p1){
        double imc;
        int pesoIdeal = 0;
        imc = p1.getPeso()/(p1.getAltura()*p1.getAltura());
        if (imc < 20) {
            pesoIdeal = -1;
        }
        else if (imc <= 25 && imc >= 20) {
            pesoIdeal = 0;
        }
        else if (imc > 25) {
            pesoIdeal = 1;
        }
        return pesoIdeal;
    }
    
    public boolean calcularEdad(Persona p1){
        boolean mayor = false;
        if (p1.getEdad()>=18) {
            mayor=true;   
        }
        return mayor;
    }
    

}

