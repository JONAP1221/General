package semana8estructuradedatos;

/**
 *
 * @author Jonathan
 */
public class ListaSimple {

    private NodoListaSimple cabeza;

    public void insertar(Persona o) {
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
        if (cabeza != null) {
            NodoListaSimple aux = cabeza;
            NodoListaSimple elNuevo;
            if (aux.getPersona().getId() == original) {
                aux.getPersona().setId(nuevo);
                cabeza = aux.getSiguiente();
                elNuevo = aux;
                moverNodo(elNuevo);
            }//final if
            aux = aux.getSiguiente();
            while (aux != cabeza) {
                 if (aux.getPersona().getId() == original) {
                    aux.getPersona().setId(nuevo);

                    elNuevo = aux;
                    moverNodo(elNuevo);
                    break;
                }//final if
                aux = aux.getSiguiente();
            }//final while
        }//Final if
    }//final del metodo modificaId

    private void moverNodo(NodoListaSimple elNuevo) {
        if (elNuevo.getPersona().getId() < cabeza.getPersona().getId()) {
            NodoListaSimple auxiliar = elNuevo;
            auxiliar.setSiguiente(cabeza);
            cabeza = auxiliar;
        } else {
            if (cabeza.getSiguiente() == null) {
                NodoListaSimple nuevo = elNuevo;
                cabeza.setSiguiente(nuevo);
            } else {
                NodoListaSimple auxiliar = cabeza;
                while (auxiliar.getSiguiente() != null
                        && auxiliar.getSiguiente().getPersona().getId() < elNuevo.getPersona().getId()) {
                    auxiliar = auxiliar.getSiguiente();
                }
                NodoListaSimple otroAuxiliar = elNuevo;
                otroAuxiliar.setSiguiente(auxiliar.getSiguiente());
                auxiliar.setSiguiente(otroAuxiliar);
            }
        }
    }//final del metodo moverAlMedio

    @Override
    public String toString() {
        NodoListaSimple aux = cabeza;
        String s = "";
        while (aux != null) {            
            s=s+aux.getPersona()+"\n";
            aux = aux.getSiguiente();
        }//final while
        return s;
    }
}//final de la clase
