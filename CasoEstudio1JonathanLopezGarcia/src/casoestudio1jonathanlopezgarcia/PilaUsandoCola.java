
package casoestudio1jonathanlopezgarcia;

/**
 *
 * @author Jonathan
 */
public class PilaUsandoCola {
    //atributos de la clase
    private ColaTareas cola;

    public PilaUsandoCola() {
        this.cola = new ColaTareas();
    }
    
    public boolean esVacia(){
        return cola.esVacia();
    }//final del metodo esVacia
    
    public void apilar(Tarea tarea){
        ColaTareas aux = new ColaTareas();
        aux.encolar(tarea);
        while (!esVacia()) {            
            aux.encolar(cola.desencolar());
        }//final while
        cola = aux;
    }//final metodo apilar
    
    public Tarea desapilar(){
        return cola.desencolar();
    }//final metodo desapilar

    @Override
    public String toString() {
        String s = "";
        ColaTareas aux = new ColaTareas();
        int contador = 1;
        while (!esVacia()) {            
            Tarea elemento = cola.desencolar();
            s = s+elemento.toString();
            aux.encolar(elemento);
        }//final while
        cola = aux;
        return s;
    }
    
    
    
}//final de la clase
