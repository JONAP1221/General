
package pkg155851933417;

/**
 *
 * @author Jonathan
 */
public class NodoCola {
    //atributos de la clase
    private Persona elemento;
    private NodoCola siguiente;
    
    public NodoCola(Persona elemento){
        this.elemento = elemento;
        this.siguiente = null;
    }//final constructor vacio

    //final gets and sets
    public Persona getElemento() {
        return elemento;
    }

    public void setElemento(Persona elemento) {
        this.elemento = elemento;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }//final gets and sets
    
    
    
}//final de la clase
