package pkg155851933417_pp3;

/**
 *
 * @author Jonathan
 */
public class NodoLista {

    //atributos de la clase
    private Persona dato;
    private Animal elemento;
    private NodoLista siguiente;

    public NodoLista(Persona dato) {
        this.dato = dato;
    }//final cosntructor lleno

    public NodoLista(Animal dato) {
        this.elemento = dato;
    }//final cosntructor lleno

    //gets and sets
    public Animal getElemento() {
        return elemento;
    }

    public void setElemento(Animal elemento) {
        this.elemento = elemento;
    }

    public Persona getDato() {
        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }//final gets and sets

    @Override
    public String toString() {
        return this.dato.toString();
    }//final metodo toString

}//final de la clase
