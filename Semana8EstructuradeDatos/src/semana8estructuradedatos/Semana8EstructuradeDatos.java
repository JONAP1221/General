
package semana8estructuradedatos;

/**
 *
 * @author Jonathan
 */
public class Semana8EstructuradeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaDobleCircular l = new ListaDobleCircular();
        
        Persona a = new Persona("Daniela", 1);
        Persona b = new Persona("Sofia",2);
        Persona c = new Persona("Juan",3);
        Persona d = new Persona("Daniela1", 7);
        Persona e = new Persona("Sofia1",12);
        Persona f = new Persona("Juan1",10);
        
        l.insertaMejorado(b);
        l.insertaMejorado(a);
        l.insertaMejorado(d);
        l.insertaMejorado(c);
        l.insertaMejorado(e);
        l.insertaMejorado(f);
        
        System.out.println(l);
    }//final main
}//final clase
