
package pkg155851933417_cp3;

/**
 *
 * @author Jonathan
 */
public class NodoArbol {
    //atributos de la clase
    private Dato dato;
    private NodoArbol NodoIzq;
    private NodoArbol NodoDer;

    public NodoArbol(Dato dato) {
        this.dato = dato;
    }//final constructor

    //gets y sets
    public Dato getDato() {
        return dato;
    }

    public void setDato(Dato dato) {
        this.dato = dato;
    }

    public NodoArbol getNodoIzq() {
        return NodoIzq;
    }

    public void setNodoIzq(NodoArbol NodoIzq) {
        this.NodoIzq = NodoIzq;
    }

    public NodoArbol getNodoDer() {
        return NodoDer;
    }

    public void setNodoDer(NodoArbol NodoDer) {
        this.NodoDer = NodoDer;
    }//final gets y sets
    
    
    
}//final de la clase
