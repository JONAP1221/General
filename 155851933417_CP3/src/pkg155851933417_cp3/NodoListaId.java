package pkg155851933417_cp3;

/**
 *
 * @author Jonathan
 */
public class NodoListaId {

    private int id;
    private NodoListaId siguiente;


    public NodoListaId(int id) {
        this.id = id;
    }

    public NodoListaId getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaId siguiente) {
        this.siguiente = siguiente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
