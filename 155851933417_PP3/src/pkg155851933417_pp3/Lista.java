package pkg155851933417_pp3;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Lista {

    //atributos de la clase
    private NodoLista cabeza;

    public void insertar(Persona p) {
        //1. La lista está vacía.
        if (cabeza == null) {//Lista vacía
            //Cualquier elemento que insertemos se va a convertir en la cabeza
            cabeza = new NodoLista(p);
        }//final if
        else {
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
            }//final if
            else {
                //3.
                //La lista sólo tiene un elemento y se debe insertar la
                //nueva persona a la derecha de la cabeza.
                //Aquí el id de la persona es mayor al id de la cabeza
                if (cabeza.getSiguiente() == null) {
                    NodoLista nuevo = new NodoLista(p);
                    //cabeza.setSiguiente(new Nodo(p));
                    cabeza.setSiguiente(nuevo);
                }//final if
                else {
                    //4.
                    //Si no se tienen las condiciones anteriores entonces se
                    //debe insertar en el medio o al final de la lista.
                    NodoLista auxiliar = cabeza;
                    while (auxiliar.getSiguiente() != null
                            && auxiliar.getSiguiente().getDato().getId() < p.getId()) {
                        auxiliar = auxiliar.getSiguiente();
                    }//final while
                    NodoLista otroAuxiliar = new NodoLista(p); //Vamos a almacenar el nodo nuevo, 
                    //para mantener las referencias
                    otroAuxiliar.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(otroAuxiliar);
                }//final else
            }//final else
        }//final else
    }//final metodo insertar

    public void insertarAnimal(Animal p) { //para no crear otras clases
        //1. La lista está vacía.
        if (cabeza == null) {//Lista vacía
            //Cualquier elemento que insertemos se va a convertir en la cabeza
            cabeza = new NodoLista(p);
        }//final if
        else {
            //2.
            //La persona a insertar tiene un id menor al que
            //referencia la cabeza (el primero y menor de la lista),
            //por lo que se debe insertar a la izquierda de la cabeza.
            //Aquí el id de la persona es menor a el id de la cabeza
            if (p.getId() < cabeza.getElemento().getId()) {
                //Entonces inserto el nuevo elemento en la cabeza
                NodoLista auxiliar = new NodoLista(p);
                auxiliar.setSiguiente(cabeza);
                cabeza = auxiliar;
            }//final if
            else {
                //3.
                //La lista sólo tiene un elemento y se debe insertar la
                //nueva persona a la derecha de la cabeza.
                //Aquí el id de la persona es mayor al id de la cabeza
                if (cabeza.getSiguiente() == null) {
                    NodoLista nuevo = new NodoLista(p);
                    //cabeza.setSiguiente(new Nodo(p));
                    cabeza.setSiguiente(nuevo);
                }//final if
                else {
                    //4.
                    //Si no se tienen las condiciones anteriores entonces se
                    //debe insertar en el medio o al final de la lista.
                    NodoLista auxiliar = cabeza;
                    while (auxiliar.getSiguiente() != null
                            && auxiliar.getSiguiente().getElemento().getId() < p.getId()) {
                        auxiliar = auxiliar.getSiguiente();
                    }//final while
                    NodoLista otroAuxiliar = new NodoLista(p); //Vamos a almacenar el nodo nuevo, 
                    //para mantener las referencias
                    otroAuxiliar.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(otroAuxiliar);
                }//final else
            }//final else
        }//final else
    }//final metodo insertar

    public void eliminarNombresRepetidos() {
        NodoLista aux = cabeza;
        int contador = 0;
        while (aux != null) {
            NodoLista siguiente = aux;//para tener de referencia al siguiente nodo
            while (siguiente.getSiguiente() != null) {
                if (siguiente.getSiguiente().getDato().getNombre().equals(aux.getDato().getNombre())) {
                    // Si el nombre del siguiente nodo es igual al nombre del nodo actual, lo eliminamos
                    siguiente.setSiguiente(siguiente.getSiguiente().getSiguiente());
                    contador++;//contador para ver cuantas personas eliminamos al final
                }//final if
                else {
                    siguiente = siguiente.getSiguiente();//sino, avanzamos con el siguiente
                }//final else
            }//final while
            aux = aux.getSiguiente(); //avanzamos en la lista
        }//final while
        System.out.println("Se han eliminado " + contador + " personas de la lista.");
    }//final metodo eliminarNombresRepetidos

    public void extraccionPorFecha(LocalDate fecha) {
        NodoLista aux = cabeza;
        NodoLista anterior = null;
        Cola cola1 = new Cola();
        while (aux != null) {
            if (aux.getElemento().getFechaNacimiento().isAfter(fecha)
                    || aux.getElemento().getFechaNacimiento().isEqual(fecha)) { //si la fecha es despues o igual 
                cola1.encolar(aux.getElemento());                            //se le agrega a la cola
                if (anterior != null) {                                      //y se elimina el elemento de la lista
                    anterior.setSiguiente(aux.getSiguiente());
                }//final if
                else {
                    cabeza = aux.getSiguiente(); //se actualiza la cabeza si el primer nodo
                }//final else                    se tiene que eliminar
            }//final if
            else {
                anterior = aux; //actualizamos el nodo anterior para guardar la info
            }//Final else
            aux = aux.getSiguiente(); // se avanza en la lista
        }//final while
        System.out.println("Animales extraidos y en la Cola: \n" + cola1); //se muestra la cola con los animales extraidos
        JOptionPane.showMessageDialog(null, "Animales extraidos y en la Cola: \n\n" + cola1);
    }//final del metodo extracciónPorFecha

    @Override
    public String toString() {
        String s = "";
        NodoLista aux = cabeza;
        while (aux != null) {
            if (aux.getDato() != null) {
                s = s + aux.getDato() + "\n"; //recorremos los nodos para                                     
                aux = aux.getSiguiente();     //obtener la informacion de las Personas
            }//final if
            if (aux != null && aux.getElemento() != null) {
                s = s + aux.getElemento() + "\n"; //recorremos los nodos para                                     
                aux = aux.getSiguiente();     //obtener la informacion de los Animales
            }//final else
        }//final while
        return s;
    }//final metodo toString

}//final clase
