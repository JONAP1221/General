package CasoEstudio2;

/**
 *
 * @author Jonathan
 */
public class NodoListaDobleCircular {

    private Persona persona;
    private Animal animal;
    private NodoListaDobleCircular anterior;
    private NodoListaDobleCircular siguiente;

    public NodoListaDobleCircular(Persona persona) {
        this.persona = persona;
    }

    public NodoListaDobleCircular(Animal animal) {
        this.animal = animal;
    }

    public Persona getDato() {
        return persona;
    }

    public void setDato(Persona persona) {
        this.persona = persona;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public NodoListaDobleCircular getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaDobleCircular anterior) {
        this.anterior = anterior;
    }

    public NodoListaDobleCircular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaDobleCircular siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return persona.toString();
    }
}//final de la clase
