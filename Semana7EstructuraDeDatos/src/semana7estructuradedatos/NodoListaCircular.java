
package semana7estructuradedatos;

/**
 *
 * @author Jonathan
 */
public class NodoListaCircular {
    private Persona dato;
    private NodoListaCircular siguiente;

    @Override
    public String toString() {
        return "NodoListaCircular:" + "\n Dato: " + dato;
    }
    
    public NodoListaCircular(Persona dato){
        this.dato = dato;
    }//final constructor

    public Persona getDato() {
        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public NodoListaCircular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaCircular siguiente) {
        this.siguiente = siguiente;
    }
    
    
}//final de la clase
