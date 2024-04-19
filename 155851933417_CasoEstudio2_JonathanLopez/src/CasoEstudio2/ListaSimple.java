package CasoEstudio2;

/**
 *
 * @author Jonathan
 */
public class ListaSimple {

    private NodoListaSimple cabeza;

    public void insertar(Persona o) { //metodo ya visto en clase
        if (cabeza == null) {
            cabeza = new NodoListaSimple(o);
        } else {
            if (o.getId() < cabeza.getPersona().getId()) {
                NodoListaSimple auxiliar = new NodoListaSimple(o);
                auxiliar.setSiguiente(cabeza);
                cabeza = auxiliar;
            } else {
                if (cabeza.getSiguiente() == null) {
                    NodoListaSimple nuevo = new NodoListaSimple(o);
                    cabeza.setSiguiente(nuevo);
                } else {
                    NodoListaSimple auxiliar = cabeza;
                    while (auxiliar.getSiguiente() != null
                            && auxiliar.getSiguiente().getPersona().getId() < o.getId()) {
                        auxiliar = auxiliar.getSiguiente();
                    }
                    NodoListaSimple otroAuxiliar = new NodoListaSimple(o);
                    otroAuxiliar.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(otroAuxiliar);
                }
            }
        }
    }

    public NodoListaSimple getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoListaSimple cabeza) {
        this.cabeza = cabeza;
    }

    public void modificaId(int original, int nuevo) {
        if (cabeza != null) { //evitar lista vacia
            NodoListaSimple aux = cabeza; //auxliar
            NodoListaSimple elNuevo; //el nodo actualizado
            if (aux.getPersona().getId() == original) { // en caso de que coincida actualizar nodos
                aux.getPersona().setId(nuevo);//actualiza el id
                cabeza = aux.getSiguiente(); // actualizacipn de nodo
                elNuevo = aux;// contiene el nodo actualizado
                moverNodo(elNuevo); // metodo para mover al nodo
            }//final if
            aux = aux.getSiguiente(); //avanzar en la lista
            while (aux != null) { //parar al final
                if (aux.getSiguiente() == null) { //por si el que sigue es el final
                 if (aux.getPersona().getId() == original) { //verifica que coincida
                    aux.getPersona().setId(nuevo); //actualiza el dato
                    elNuevo = aux; //el nodo actualizado
                    aux.setSiguiente(null); //el final
                    moverNodo(elNuevo);
                    break;
                }//final if 
                }//final if
                 if (aux.getPersona().getId() == original) { 
                    aux.getPersona().setId(nuevo);
                    elNuevo = aux.getSiguiente();
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    
                    
                    moverNodo(elNuevo);
                    break;
                }//final if 
                aux = aux.getSiguiente();
            }//final while
        }//Final if
    }//final del metodo modificaId

    private void moverNodo(NodoListaSimple elNuevo) {
        if (elNuevo.getPersona().getId() < cabeza.getPersona().getId()) { //verifica si es mayor a la cabeza
            NodoListaSimple auxiliar = elNuevo; //actualiza el nodo
            auxiliar.setSiguiente(cabeza);//actualiza conexiones
            cabeza = auxiliar;//actualiza conexiones
        } else {
            if (cabeza.getSiguiente() == null) {
                NodoListaSimple nuevo = elNuevo;
                cabeza.setSiguiente(nuevo);//actualiza conexiones
            } else {
                NodoListaSimple auxiliar = cabeza;//actualiza conexiones
                while (auxiliar.getSiguiente() != null //verificca el final de la lista
                        && auxiliar.getSiguiente().getPersona().getId() < elNuevo.getPersona().getId()) {
                    auxiliar = auxiliar.getSiguiente();//actualiza conexiones
                }
                NodoListaSimple otroAuxiliar = elNuevo; //actualiza el nodo
                otroAuxiliar.setSiguiente(auxiliar.getSiguiente());//actualiza conexiones
                auxiliar.setSiguiente(otroAuxiliar);//actualiza conexiones
            }
        }
    }//final del metodo moverAlMedio

    @Override
    public String toString() { //simplemente recorre la lista
        NodoListaSimple aux = cabeza;
        String s = "";
        while (aux != null) {            
            s=s+aux.getPersona()+"\n";
            aux = aux.getSiguiente();
        }//final while
        return s;
    }
}//final de la clase
