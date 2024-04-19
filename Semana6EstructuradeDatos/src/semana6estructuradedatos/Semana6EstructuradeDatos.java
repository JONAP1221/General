
package semana6estructuradedatos;

/**
 *
 * @author Jonathan
 */
public class Semana6EstructuradeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista1 = new Lista();
        
        Persona a = new Persona(23, "Maria");
        
        lista1.insertar(a);
        lista1.insertar(new Persona(20, "Miguel"));
        lista1.insertar(new Persona(25, "Orlando"));
        lista1.insertar(new Persona(17, "Sofia"));
        
        System.out.println(lista1.toString());
        
        System.out.println(lista1.existe(21));
        
        lista1.modifica(a);
        System.out.println("\n\n");
        lista1.elimina(20);
        System.out.println(lista1.toString());
        System.out.println("\n\n"+lista1.extrae(25));
        System.out.println("\n\n"+lista1);
    }
    
}
