
package casoestudio1jonathanlopezgarcia;

/**
 *
 * @author Jonathan
 */
public class NodoCola {
    private Tarea tarea;
    private NodoCola siguiente;
    
    public NodoCola(Tarea dato) {
        this.tarea = dato;
        this.siguiente = null;
    }
    
    public Tarea getDato() {
        return tarea;
    }
    
    public void setDato(Tarea dato) {
        this.tarea = dato;
    }
    
    public NodoCola getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
}//final de la clase
