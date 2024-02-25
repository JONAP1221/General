package pkg155851933417_pp3;

/**
 *
 * @author Jonathan
 */
public class Cola {

    //atributos de la clase
    private NodoCola primero;
    private NodoCola ultimo;

    public Cola() {
        this.primero = null;
        this.ultimo = null;
    }//final constructor vacio

    public boolean esVacia() {
        return primero == null;
    }//final metodo esVacia

    public void encolar(Animal animal) {
        NodoCola nuevoNodo = new NodoCola(animal);
        if (esVacia()) {//si esta vacia se agrega
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        }//final if 
        else {//si ya tenia un elemento antes lo pone de ultimo
            ultimo.setSiguiente(nuevoNodo);
            ultimo = nuevoNodo;
        }//final else
    }//final metodo encolar

    @Override
    public String toString() {
        String s = "";
        if (!esVacia()) {
            NodoCola aux = primero;
            while (aux != null) {
                s = s + aux.getAnimal() + "\n";
                aux = aux.getSiguiente();
            }//Final while
        }//final if
        return s;
    }//final metodo toString
}//final de la clase
