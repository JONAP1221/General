
package practica;

/**
 *
 * @author Jonathan
 */
public class ListaCircularSimple {
    NodoListaCircularSimple cabeza;
    NodoListaCircularSimple ultimo;
    
    public void inserta(int numero)
    {
        if(cabeza == null)
        {
            cabeza = new NodoListaCircularSimple(numero);
            ultimo = cabeza;
            ultimo.setSiguiente(cabeza);
        }
        else
        {
            if(numero < cabeza.getNumero())
            {
                //Insertamos al inicio
                NodoListaCircularSimple auxiliar = new NodoListaCircularSimple(numero);
                auxiliar.setSiguiente(cabeza);
                cabeza = auxiliar;
                ultimo.setSiguiente(cabeza);
            }
            else
            {
                if(ultimo.getNumero() < numero)
                {
                    //Insertamos al final
                    NodoListaCircularSimple auxiliar = new NodoListaCircularSimple(numero);
                    ultimo.setSiguiente(auxiliar);
                    ultimo = auxiliar;
                    ultimo.setSiguiente(cabeza);
                }
                else
                {
                    //Insertamos en el medio de la lista
                    NodoListaCircularSimple auxiliar = cabeza;
                    while(auxiliar.getSiguiente().getNumero() < numero)
                    {
                        auxiliar = auxiliar.getSiguiente();
                    }
                    
                    NodoListaCircularSimple temporal = new NodoListaCircularSimple(numero);
                    temporal.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(temporal);
                }
            }
        }
    }
    

    @Override
    public String toString() {
        String respuesta = "Lista circular: \n";
        
        NodoListaCircularSimple auxiliar = cabeza;
        
        if(auxiliar != null)
        {
            //Para determinar que no está vacía
            respuesta += auxiliar.toString() + "\n";
            auxiliar = auxiliar.getSiguiente();
            while(auxiliar != cabeza)
            {
                respuesta += auxiliar.toString() + "\n";
                auxiliar = auxiliar.getSiguiente();
            }
        }
        else
        {
            respuesta += "Vacía";
        }
        
        return respuesta;
    }
    
    public Cola copiarEnCola(){
        Cola cola = new Cola();
        
        NodoListaCircularSimple aux = cabeza;
        if (aux !=null) {
            cola.encolar(aux.getNumero());
            aux = aux.getSiguiente();
            while (aux != cabeza) {                
                cola.encolar(aux.getNumero());
                aux = aux.getSiguiente();
            }//Final while
        }//Final if
        return cola;
    }//final del metodo copiarEnCola
}//fin clase
