
package pkg155851933417;

/**
 *
 * @author Jonathan
 */
public class NodoPila {
    //atributos de la clase
    private Animal elemento;
    private NodoPila siguiente;

    public NodoPila() {
        this.siguiente = null;
    }//final constructor vacio

    //gets and sets
    public Animal getElemento() {
        return elemento;
    }

    public void setElemento(Animal elemento) {
        this.elemento = elemento;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }//final gets and sets

    
    
    
    
}//final de la clase
