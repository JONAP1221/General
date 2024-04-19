
package practica;

import java.util.Random;

/**
 *
 * @author Jonathan
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaCircularSimple l = new ListaCircularSimple();
        Random random = new Random();
        Cola cola = new Cola();
        
        for (int i = 0; i < 30; i++) {
            
            l.inserta(random.nextInt(30)+1);
        }//Final for
        cola = l.copiarEnCola();
        System.out.println(l);
        System.out.println("Cola copiada:\n\n"+cola);
    }//fin main
}//final de la clase
