package semana7estructuradedatos;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class ListaCircular {

    private NodoListaCircular cabeza;
    private NodoListaCircular ultimo;

    public void inserta(Persona p) {
        if (cabeza == null) {
            cabeza = new NodoListaCircular(p);
            ultimo = cabeza;
            ultimo.setSiguiente(cabeza);
        }//final if
        else if (p.getId() < cabeza.getDato().getId()) {
            //Insertamos al inicio
            NodoListaCircular auxiliar = new NodoListaCircular(p);
            auxiliar.setSiguiente(cabeza);
            cabeza = auxiliar;
            ultimo.setSiguiente(cabeza);
        }//final else if
        else if (ultimo.getDato().getId() < p.getId()) {
            //Insertamos al final
            NodoListaCircular auxiliar = new NodoListaCircular(p);
            ultimo.setSiguiente(auxiliar);
            ultimo = auxiliar;
            ultimo.setSiguiente(cabeza);
        }//final else if
        else {
            //Insertamos en el medio de la lista
            NodoListaCircular auxiliar = cabeza;
            while (auxiliar.getSiguiente().getDato().getId() < p.getId()) {
                auxiliar = auxiliar.getSiguiente();
            }//final while

            NodoListaCircular temporal = new NodoListaCircular(p);
            temporal.setSiguiente(auxiliar.getSiguiente());
            auxiliar.setSiguiente(temporal);
        }//Final else
    }//final del metodo inserta}

    public boolean existe(int id) {
        boolean a = false;
        NodoListaCircular aux = cabeza;
        if (aux != null) {
            aux = aux.getSiguiente();
            while (aux != cabeza) {
                if (aux.getSiguiente().getDato().getId() == id) {
                    a = true;
                    break;
                }//final if
                aux = aux.getSiguiente();
            }//final while
        }//final if
        return a;
    }//final del metodo existe

    public void modifica(Persona p) {
        NodoListaCircular aux = cabeza;
        if (aux != null) {
            if (aux.getDato() == p) {
                aux.getDato().setNombre(JOptionPane.showInputDialog("Digite el nuevo nombre: "));
            }//final if
            else {
                aux = aux.getSiguiente();
                while (aux != cabeza) {
                    if (aux.getDato() == p) {
                        aux.getDato().setNombre(JOptionPane.showInputDialog("Digite el nuevo nombre: "));
                        break;
                    }//final if
                    aux = aux.getSiguiente();
                }//final while
            }//final else  
        }//final if
    }//final del metodo modifica

    public void elimina(int id) {
        NodoListaCircular aux = cabeza;
        NodoListaCircular anterior = null;

        if (aux != null) {
            do {
                if (aux.getDato().getId() == id) {
                    if (anterior != null) {
                        anterior.setSiguiente(aux.getSiguiente());
                        if (aux == ultimo) {
                            ultimo = anterior;
                        }
                    } else {
                        cabeza = aux.getSiguiente();
                        ultimo.setSiguiente(cabeza);
                    }
                    break;
                }
                anterior = aux;
                aux = aux.getSiguiente();
            } while (aux != cabeza);
        }
    }

    public Persona extrae(int id) {
        NodoListaCircular aux = cabeza;
        NodoListaCircular anterior = null;

        if (aux != null) {
            do {
                if (aux.getDato().getId() == id) {
                    if (anterior != null) {
                        anterior.setSiguiente(aux.getSiguiente());
                        if (aux == ultimo) {
                            ultimo = anterior;
                        }
                    } else {
                        cabeza = aux.getSiguiente();
                        ultimo.setSiguiente(cabeza);
                    }
                    return aux.getDato();
                }
                anterior = aux;
                aux = aux.getSiguiente();
            } while (aux != cabeza);
        }

        return null; // Devuelve null si no se encuentra el elemento con el ID especificado
    }

    @Override
    public String toString() {
        String respuesta = "Lista circular: \n";

        NodoListaCircular auxiliar = cabeza;

        if (auxiliar != null) {
            //Para determinar que no está vacía
            respuesta += auxiliar.toString() + "\n";
            auxiliar = auxiliar.getSiguiente();
            while (auxiliar != cabeza) {
                respuesta += auxiliar.toString() + "\n";
                auxiliar = auxiliar.getSiguiente();
            }
        } else {
            respuesta += "Vacía";
        }

        return respuesta;
    }
}
