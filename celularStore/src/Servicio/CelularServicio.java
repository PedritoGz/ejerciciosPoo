package Servicio;

import Entidades.Celular;
import java.util.Scanner;

public class CelularServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Celular c1 = new Celular();

    public Celular cargarCelular() {
        System.out.println("Ingresa la marca");
        c1.setMarca(sc.next());
        System.out.println("Ingresa el modelo");
        c1.setModelo(sc.next());
        System.out.println("Ingresa el precio");
        c1.setPrecio(sc.nextDouble());
        System.out.println("Ingresa la ram");
        c1.setRam(sc.nextInt());
        System.out.println("Ingresa el almacenamiento");
        c1.setAlmacenamiento(sc.nextInt());
        int srl[] = ingresarCodigo();
        c1.setCodigo(srl);
        return c1;
    }

    public int[] ingresarCodigo() {
        System.out.println("Ingresa el codigo");
        int[] srl = new int[7];
        for (int i = 0; i < 7; i++) {
            srl[i] = sc.nextInt();
        }
        return srl;
    }

}
/*Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo*/
