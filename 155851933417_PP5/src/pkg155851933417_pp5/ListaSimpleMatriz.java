package pkg155851933417_pp5;

/**
 *
 * @author Jonathan
 */
public class ListaSimpleMatriz {

    //atributos de la clase
    private NodoListaSimpleMatriz cabeza;

    public void insertar(Objeto o) {
        //1. La lista está vacía.
        if (cabeza == null) {//Lista vacía
            //Cualquier elemento que insertemos se va a convertir en la cabeza
            cabeza = new NodoListaSimpleMatriz(o);
        }//final if
        else {
            //2.
            //La persona a insertar tiene un id menor al que
            //referencia la cabeza (el primero y menor de la lista),
            //por lo que se debe insertar a la izquierda de la cabeza.
            //Aquí el id de la persona es menor a el id de la cabeza
            if (o.getId() < cabeza.getObjeto().getId()) {
                //Entonces inserto el nuevo elemento en la cabeza
                NodoListaSimpleMatriz auxiliar = new NodoListaSimpleMatriz(o);
                auxiliar.setSiguiente(cabeza);
                cabeza = auxiliar;
            }//final if
            else {
                //3.
                //La lista sólo tiene un elemento y se debe insertar la
                //nueva persona a la derecha de la cabeza.
                //Aquí el id de la persona es mayor al id de la cabeza
                if (cabeza.getSiguiente() == null) {
                    NodoListaSimpleMatriz nuevo = new NodoListaSimpleMatriz(o);
                    //cabeza.setSiguiente(new Nodo(p));
                    cabeza.setSiguiente(nuevo);
                }//final if
                else {
                    //4.
                    //Si no se tienen las condiciones anteriores entonces se
                    //debe insertar en el medio o al final de la lista.
                    NodoListaSimpleMatriz auxiliar = cabeza;
                    while (auxiliar.getSiguiente() != null
                            && auxiliar.getSiguiente().getObjeto().getId() < o.getId()) {
                        auxiliar = auxiliar.getSiguiente();
                    }//final while
                    NodoListaSimpleMatriz otroAuxiliar = new NodoListaSimpleMatriz(o); //Vamos a almacenar el nodo nuevo, 
                    //para mantener las referencias
                    otroAuxiliar.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(otroAuxiliar);
                }//final else
            }//final else
        }//final else
    }//final metodo insertar

    @Override
    public String toString() {
        String s = "";
        NodoListaSimpleMatriz aux = cabeza;
        while (aux != null) {
            s = s + aux.getObjeto().getId()+ "\n"; //recorremos los nodos para                                     
            aux = aux.getSiguiente();     //obtener la informacion de las Objetos
        }//final while
        return s;
    }//final metodo toString

    public NodoListaSimpleMatriz getCabeza() {
        return cabeza;
    }
}
