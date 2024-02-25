
package casoestudio1jonathanlopezgarcia;

/**
 *
 * @author Jonathan
 */
public class NodoSupermercado {
    private Articulo dato;
    private NodoSupermercado atras;

    public NodoSupermercado(Articulo dato) {
        this.dato = dato;
        this.atras = null;
    }

    public Articulo getDato() {
        return dato;
    }

    public void setDato(Articulo dato) {
        this.dato = dato;
    }

    public NodoSupermercado getAtras() {
        return atras;
    }

    public void setAtras(NodoSupermercado atras) {
        this.atras = atras;
    }

    @Override
    public String toString() {
        return this.dato.toString();
    }
    
   
}//final clase
