package semana6estructuradedatos;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Lista {

    private NodoLista cabeza;

    public void insertar(Persona p) {
        //1. La lista está vacía.
        if (cabeza == null) //Lista vacía
        {
            //Cualquier elemento que insertemos se va a convertir en la cabeza
            cabeza = new NodoLista(p);
        } else {
            //2.
            //La persona a insertar tiene un id menor al que
            //referencia la cabeza (el primero y menor de la lista),
            //por lo que se debe insertar a la izquierda de la cabeza.
            //Aquí el id de la persona es menor a el id de la cabeza
            if (p.getId() < cabeza.getDato().getId()) {
                //Entonces inserto el nuevo elemento en la cabeza
                NodoLista auxiliar = new NodoLista(p);
                auxiliar.setSiguiente(cabeza);
                cabeza = auxiliar;
            } else {
                //3.
                //La lista sólo tiene un elemento y se debe insertar la
                //nueva persona a la derecha de la cabeza.
                //Aquí el id de la persona es mayor al id de la cabeza
                if (cabeza.getSiguiente() == null) {
                    NodoLista nuevo = new NodoLista(p);
                    //cabeza.setSiguiente(new Nodo(p));
                    cabeza.setSiguiente(nuevo);
                } else {
                    //4.
                    //Si no se tienen las condiciones anteriores entonces se
                    //debe insertar en el medio o al final de la lista.
                    NodoLista auxiliar = cabeza;
                    while (auxiliar.getSiguiente() != null
                            && auxiliar.getSiguiente().getDato().getId() < p.getId()) {
                        auxiliar = auxiliar.getSiguiente();
                    }

                    NodoLista otroAuxiliar = new NodoLista(p); //Vamos a almacenar el nodo nuevo, 
                    //para mantener las referencias
                    otroAuxiliar.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(otroAuxiliar);
                }
            }
        }
    }

    public boolean existe(int id) {
        boolean respuesta = false;
        NodoLista aux = cabeza;
        while (aux != null) {
            if (aux.getDato().getId() == id) {
                respuesta = true;
                break;
            }//final if
            else {
                aux = aux.getSiguiente();
            }
        }//final while
        return respuesta;
    } //final del metodo existe

    public void modifica(Persona p) {
        NodoLista aux = cabeza;
        while (aux != null) {
            if (aux.getDato().getId() == p.getId()) {
                aux.getDato().setNombre(JOptionPane.showInputDialog("Digite el nuevo nombre: "));
                JOptionPane.showMessageDialog(null, "Se ha cambiado el nombre exisotamente.");
                break;
            }//final if
            else {
                aux = aux.getSiguiente();
            }//final else
        }//final while
    }//final del metodo modifica

    public void elimina(int id) {
        NodoLista aux = cabeza;
        NodoLista anterior = null;
        while (aux != null) {
            if (aux.getDato().getId() == id) {
                if (aux == cabeza) {
                    cabeza = cabeza.getSiguiente();
                    aux.setSiguiente(null);
                    break;
                }//final if
                else {
                    anterior.setSiguiente(aux.getSiguiente());
                    aux.setSiguiente(null);
                    break;
                }//final else
            }//final if
            else {
                anterior = aux;
                aux = aux.getSiguiente();
            }//final else
        }//final while
    }//final del metodo elimina

    public Persona extrae(int id) {
        Persona p = null;

        return p;
    }//final del metodo extrae

    public Persona buscar(int id) {
        Persona p = null;
        NodoLista aux = cabeza;
        while (aux != null) {

        }
        return p;
    }//final del metodo buscar

    @Override
    public String toString() {
        String s = "";
        NodoLista aux = cabeza;
        while (aux != null) {
            s = s + aux.getDato() + "\n";
            aux = aux.getSiguiente();
        }//final while
        return s;
    }

}
