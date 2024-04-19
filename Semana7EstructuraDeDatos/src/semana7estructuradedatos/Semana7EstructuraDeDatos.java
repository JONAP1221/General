
package semana7estructuradedatos;

/**
 *
 * @author Jonathan
 */
public class Semana7EstructuraDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaCircular l = new ListaCircular();
        
        Persona a = new Persona(1, "Manuel");
        Persona b = new Persona(2, "Sofia");
        Persona c = new Persona(3, "Juan");
        
        l.inserta(a);
        l.inserta(b);
        l.inserta(c);
        
        System.out.println(l);
        
        l.modifica(b);
        
        System.out.println(l);
    }//final main
    
}//final de la clase
