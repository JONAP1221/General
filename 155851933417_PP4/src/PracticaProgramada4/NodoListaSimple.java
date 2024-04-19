
package PracticaProgramada4;

/**
 *
 * @author Jonathan
 */
public class NodoListaSimple {
    private Dato data;
    private NodoListaSimple siguiente;
 
    public NodoListaSimple(Dato data) {
        this.data = data;
    }
 
    public Dato getDato() {
        return data;
    }
 
    public void setDato(Dato data) {
        this.data = data;
    }
 
    public NodoListaSimple getSiguiente() {
        return siguiente;
    }
 
    public void setSiguiente(NodoListaSimple siguiente) {
        this.siguiente = siguiente;
    }
 
}//final de la clase
