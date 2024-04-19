package pkg155851933417_pp5;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class ListaSimpleId {

    //atributos de la clase
    private NodoListaId cabeza;

    public void insertar(int o) {
        NodoListaId verificar = existe(o);
        if (verificar == null) {
            //1. La lista está vacía.
            if (cabeza == null) {//Lista vacía
                //Cualquier elemento que insertemos se va a convertir en la cabeza
                cabeza = new NodoListaId(o);
            }//final if
            else {
                //2.
                //La persona a insertar tiene un id menor al que
                //referencia la cabeza (el primero y menor de la lista),
                //por lo que se debe insertar a la izquierda de la cabeza.
                //Aquí el id de la persona es menor a el id de la cabeza
                if (o < cabeza.getId()) {
                    //Entonces inserto el nuevo elemento en la cabeza
                    NodoListaId auxiliar = new NodoListaId(o);
                    auxiliar.setSiguiente(cabeza);
                    cabeza = auxiliar;
                }//final if
                else {
                    //3.
                    //La lista sólo tiene un elemento y se debe insertar la
                    //nueva persona a la derecha de la cabeza.
                    //Aquí el id de la persona es mayor al id de la cabeza
                    if (cabeza.getSiguiente() == null) {
                        NodoListaId nuevo = new NodoListaId(o);
                        //cabeza.setSiguiente(new Nodo(p));
                        cabeza.setSiguiente(nuevo);
                    }//final if
                    else {
                        //4.
                        //Si no se tienen las condiciones anteriores entonces se
                        //debe insertar en el medio o al final de la lista.
                        NodoListaId auxiliar = cabeza;
                        while (auxiliar.getSiguiente() != null
                                && auxiliar.getSiguiente().getId() < o) {
                            auxiliar = auxiliar.getSiguiente();
                        }//final while
                        NodoListaId otroAuxiliar = new NodoListaId(o); //Vamos a almacenar el nodo nuevo, 
                        //para mantener las referencias
                        otroAuxiliar.setSiguiente(auxiliar.getSiguiente());
                        auxiliar.setSiguiente(otroAuxiliar);
                    }//final else
                }//final else
            }//final else
        }//final if
        else{
            System.out.println("Ya esta conectado");
        }//final else

    }//final metodo insertar

    public void elimina(int id) {
        NodoListaId auxiliar = cabeza; // se setea al auxiliar a la cabeza de la lista 
        NodoListaId anterior = null; // el anterior se setea a null para isarlo mas adelante

        while (auxiliar != null)// se verifica que la fila no este vacia 
        {
            if (auxiliar.getId() == id)// se vusca el id deseado a eliminar 
            {
                if (auxiliar == cabeza)// si el nodo a eliminar es la cabeza se sete el siguiente nodo como la cabeza 
                {
                    cabeza = cabeza.getSiguiente();
                    auxiliar.setSiguiente(null);
                    break;
                } else {
                    anterior.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(null);
                    break;
                }
            } else// no hay dato para eliminar 
            {
                anterior = auxiliar;
                auxiliar = auxiliar.getSiguiente();
            }
        }
    }

    @Override
    public String toString() {
        String s = "";
        NodoListaId aux = cabeza;
        while (aux != null) {
            s = s + aux.getId() + "\n"; //recorremos los nodos para                                     
            aux = aux.getSiguiente();     //obtener la informacion de las Objetos
        }//final while
        return s;
    }//final metodo toString

    public NodoListaId existe(int id) {
        NodoListaId s = null;
        NodoListaId aux = cabeza;
        while (aux != null) {
            if (aux.getId() == id) { //se recorre para buscar el id
                s = aux; //si lo encuentra lo devuelve
                break; //se rompe el while
            }//final if                                
            aux = aux.getSiguiente(); //se avanza en la lista
        }//final while
        return s;
    }//final metodo toString

    public NodoListaId getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoListaId cabeza) {
        this.cabeza = cabeza;
    }

}//final clase
