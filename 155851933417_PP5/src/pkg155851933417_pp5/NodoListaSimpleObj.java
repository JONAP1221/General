package pkg155851933417_pp5;


/**
 *
 * @author Jonathan
 */
public class NodoListaSimpleObj {

    private Objeto objeto;
    private ListaSimpleId listaId;
    private NodoListaSimpleObj siguiente;
    
    public NodoListaSimpleObj() {
    }

    public NodoListaSimpleObj(Objeto objeto) {
        this.objeto = objeto;
        this.listaId = new ListaSimpleId();
        this.listaId.insertar(objeto.getId());
    }

    public NodoListaSimpleObj getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaSimpleObj siguiente) {
        this.siguiente = siguiente;
    }

    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

    public ListaSimpleId getListaId() {
        return listaId;
    }

    public void setListaId(ListaSimpleId listaId) {
        this.listaId = listaId;
    }
    

}
