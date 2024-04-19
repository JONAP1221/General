package PracticaProgramada4;

import PracticaProgramada4.NodoListaSimple;

/**
 *
 * @author Jonathan
 */
public class ListaSimple {

    private NodoListaSimple cabeza;

    public void insertar(Dato data) { //metodo ya visto en clase
        if (cabeza == null) {
            cabeza = new NodoListaSimple(data);
        } else {
            if (data.getId() < cabeza.getDato().getId()) {
                NodoListaSimple auxiliar = new NodoListaSimple(data);
                auxiliar.setSiguiente(cabeza);
                cabeza = auxiliar;
            } else {
                if (cabeza.getSiguiente() == null) {
                    NodoListaSimple nuevo = new NodoListaSimple(data);
                    cabeza.setSiguiente(nuevo);
                } else {
                    NodoListaSimple auxiliar = cabeza;
                    while (auxiliar.getSiguiente() != null
                            && auxiliar.getSiguiente().getDato().getId() < data.getId()) {
                        auxiliar = auxiliar.getSiguiente();
                    }
                    NodoListaSimple otroAuxiliar = new NodoListaSimple(data);
                    otroAuxiliar.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(otroAuxiliar);
                }
            }
        }
    }

    @Override
    public String toString() { //simplemente recorre la lista
        NodoListaSimple aux = cabeza;
        String s = "";
        while (aux != null) {
            s = s + aux.getDato().getNombre() + "\n";
            aux = aux.getSiguiente();
        }//final while
        return s;
    }
}//final de la clase
