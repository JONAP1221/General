package practica;

/**
 *
 * @author Jonathan
 */
public class NodoListaCircularSimple {

    NodoListaCircularSimple siguiente;
    int numero;

    public NodoListaCircularSimple(int numero) {
        this.numero = numero;
    }

    public NodoListaCircularSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaCircularSimple siguiente) {
        this.siguiente = siguiente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Numero: " + numero;
    }

    
}//fin clase
