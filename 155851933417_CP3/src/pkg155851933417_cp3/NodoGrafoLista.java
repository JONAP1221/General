package pkg155851933417_cp3;

/**
 *
 * @author Jonathan
 */
public class NodoGrafoLista {

    private final ListaSimpleObj objeto = new ListaSimpleObj();
    private final ListaSimpleId id = new ListaSimpleId();
    private NodoGrafoLista siguiente;
    
    public NodoGrafoLista(Objeto objeto) {
        this.objeto.insertar(objeto);
        this.id.insertar(objeto.getId());
        this.siguiente = null;
    }

    public ListaSimpleId getId() {
        return id;
    }

    public ListaSimpleObj getObjeto() {
        return this.objeto;
    }

    public NodoGrafoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoGrafoLista siguiente) {
        this.siguiente = siguiente;
    }

}
