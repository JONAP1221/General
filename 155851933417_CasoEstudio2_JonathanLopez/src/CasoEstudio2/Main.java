
package CasoEstudio2;

import java.time.LocalDate;

/**
 *
 * @author Jonathan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaDobleCircular l = new ListaDobleCircular();
        ListaDobleCircular l2 = new ListaDobleCircular();
        ListaSimple se = new ListaSimple();
        
        //tercer ejercicio
        for (int i = 0; i < 10; i++) {
            Persona a = new Persona(i+1, "Hola", "Agente", LocalDate.EPOCH);
            se.insertar(a);
        }//final for
        se.modificaId(1,20);
        System.out.println(se);
        
        //primer ejercicio
        
        for (int i = 10; i < 20; i++) {
            Persona a = new Persona(i+1, "Jona"+i, "L", LocalDate.now());
            l.insertarMejorado(a);
        }//Final for
        System.out.println(l);
        l.imprimirRecursivo();
        
        //segundo eercicio
        for (int i = 0; i < 3; i++) {
           Animal a = new Animal(i+1, "Osito"+i, "Aja", LocalDate.now());
            l2.insertarMejoradoAnimal(a); 
        }//final for
        System.out.println(l2.AnteriorAnteriorDelNodo(2));
    }//final main
}//final de la clase
