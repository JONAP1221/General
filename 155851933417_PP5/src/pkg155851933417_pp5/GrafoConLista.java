package pkg155851933417_pp5;

/**
 *
 * @author Jonathan
 */
public class GrafoConLista {

    private NodoGrafoLista vertices;//atributos de la clase
    private int tamaño;//tamalño de los vertices

    public GrafoConLista() {//se inicializan las variables
        vertices = null;
        tamaño = 0;
    }

    public void agregarVertice(Objeto o) {
        if (vertices == null) { //en caso de estar vacia
            vertices = new NodoGrafoLista(o); //se le agrega el vertice
        } else {// en caso de ya haber una
            NodoGrafoLista actual = vertices; //se obtiene la cabeza
            while (actual.getSiguiente() != null) { //y se va al final
                actual = actual.getSiguiente(); //se agrega
            }
            actual.setSiguiente(new NodoGrafoLista(o)); //se añade
        }
        tamaño++; //se aumenta el tamaño
    }//final del metodo agregarVertice

    public void agregarArista(int idOrigen, int idDestino) { //para añadir el arista
        NodoGrafoLista nodoOrigen = encontrarNodo(idOrigen); //se verifica que el origen exista
        NodoGrafoLista nodoDestino = encontrarNodo(idDestino); //al iual que el destino
        if (nodoOrigen != null && nodoDestino != null) { //en caso de existir
            nodoOrigen.getId().insertar(idDestino); //se inserta el idDestino a la lista con ids
        } else { //si no se da un aviso a la consola
            System.out.println("El nodo origen o el de destino no existe.");
        }
    }

    public void eliminarArista(int idOrigen, int idDestino) { //para eliminar
        NodoGrafoLista nodoOrigen = encontrarNodo(idOrigen); //lo mismo que para el de añadir
        NodoGrafoLista nodoDestino = encontrarNodo(idDestino); //se verifica que ambos existan
        if (nodoOrigen != null && nodoDestino != null) { //en caso de estar
            NodoGrafoLista actual = nodoOrigen; // se obtiene el vertic
        } else {
            System.out.println("El nodo origen o destino no existe."); //en caso del que el nodo origen no exista
        }
    }

    public void imprimirGrafo() { //para imprimir el grafo
        NodoGrafoLista actual = vertices; //se obtienen los vertices
        while (actual != null) { //mientras que existan vertices
            System.out.print("Vertice: " + actual.getObjeto() + " - Adyacentes: \n "); //se imprime el vertice actual y despues los adyacentes
            NodoListaId adyacente = actual.getId().getCabeza().getSiguiente(); //se obtiene el siguiente de adyacentes para que no se muestre a el mismo
            while (adyacente != null) { //mientras que el siguiente no sea null
                NodoGrafoLista adya = encontrarNodo(adyacente.getId()); //se busca el nodoGrafo 
                if (adya != null) { //si le devuelve 
                    System.out.print(adya.getObjeto().getCabeza().getObjeto().getNombre()+ " "); //se obtiene el nombre del vertice
                    adyacente = adyacente.getSiguiente(); //se avanza para los demás
                }
            }
            System.out.println(); //se da un salto de linea
            actual = actual.getSiguiente(); //se avanza al siguiente vertice
        }
    }

    private NodoGrafoLista encontrarNodo(int id) { //para encontrarNodo
        NodoGrafoLista x = null; // para devolver
        NodoGrafoLista actual = vertices; //se obtienen los vertices
        while (actual != null) { //en caso de haber
            if (actual.getId().getCabeza().getId() == id) { //busca el id
                x = actual; //si coincide actualiza la x
                break; //se rompe el while
            }
            actual = actual.getSiguiente(); //sino se sigue buscando en los demás vertices
        }
        return x;//al final devuelve null o el vertice en caso de coincidir
    }

}//Final de la clase
