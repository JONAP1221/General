package pkg155851933417_pp5;

/**
 *
 * @author Jonathan
 */
public class NodoListaSimpleMatriz {
    private Objeto objeto;
    private NodoListaSimpleMatriz siguiente;
    
    public NodoListaSimpleMatriz() {
    }

    public NodoListaSimpleMatriz(Objeto objeto) {
        this.objeto = objeto;
    }

    public NodoListaSimpleMatriz getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaSimpleMatriz siguiente) {
        this.siguiente = siguiente;
    }

    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }
}
    
