
package pkg155851933417_pp3;

/**
 *
 * @author Jonathan
 */
public class NodoCola {
    //atributos de la clase
    private Animal animal;
    private NodoCola siguiente;
    
    public NodoCola(Animal animal){
        this.animal = animal;
        this.siguiente = null;
    }//final constructor vacio

    //final gets and sets
    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }//final gets and sets
    
    
    
}//final de la clase
