package CasoEstudio2;

/**
 *
 * @author Jonathan
 */
public class ListaDobleCircular {

    private NodoListaDobleCircular cabeza;
    private NodoListaDobleCircular ultimo;

    public NodoListaDobleCircular getCabeza() {
        return cabeza;
    }

    public NodoListaDobleCircular getUltimo() {
        return ultimo;
    }

    public void insertarMejorado(Persona persona) {
        // paso 1, de la presentación
        if (cabeza == null) {  // ver si la lista no esta vacia
            cabeza = new NodoListaDobleCircular(persona);
            ultimo = cabeza;  // asigna el nuevo nodo como el último también
            cabeza.setAnterior(ultimo);  // asigna el nodo anterior de la cabeza como el último
            cabeza.setSiguiente(ultimo);  // asigna el nodo siguiente de la cabeza como el último
            ultimo.setSiguiente(cabeza);  // asigna el siguiente del último como la cabeza (lista circular)
            ultimo.setAnterior(cabeza);  // asigna el anterior del último como la cabeza (lista circular)
        } else {
            // paso 2, de la presentación
            if (cabeza.getDato().getId() > persona.getId()) {  // verifica si el ID del primer elemento es mayor al nuevo dato
                NodoListaDobleCircular aux = new NodoListaDobleCircular(persona);  // crea un nuevo nodo con el dato
                aux.setSiguiente(cabeza);  // se asigna el siguiente del nuevo nodo como la cabeza actual
                cabeza.setAnterior(aux);  // se asigna el anterior de la cabeza actual como el nuevo nodo
                cabeza = aux;  // se asigna el nuevo nodo como la nueva cabeza
                cabeza.setAnterior(ultimo);  // se asigna el anterior de la nueva cabeza como el último
                ultimo.setSiguiente(cabeza);  // se asigna el siguiente del último como la nueva cabeza
            } else {
                // paso 3, de la presentación
                if (persona.getId() > ultimo.getDato().getId()) {  // verifica si el ID del nuevo dato es mayor al último elemento
                    NodoListaDobleCircular aux = new NodoListaDobleCircular(persona);  // crea un nuevo nodo con el dato
                    aux.setAnterior(ultimo);  // se asigna el anterior del nuevo nodo como el último
                    ultimo.setSiguiente(aux);  // se asigna el siguiente del último como el nuevo nodo
                    ultimo = aux;  // se asigna el nuevo nodo como el nuevo último
                    ultimo.setSiguiente(cabeza);  // se asigna el siguiente del último como la cabeza
                    cabeza.setAnterior(ultimo);  // se asigna el anterior de la cabeza como el último
                } else {
                    // paso 4
                    // se tien que hacer dos variables 
                    NodoListaDobleCircular c = cabeza;  // declaración de una variable para recorrer la lista desde la cabeza
                    NodoListaDobleCircular u = ultimo;  // declaración de una variable para recorrer la lista desde el último

                    while (c.getDato().getId() <= persona.getId() && persona.getId() <= u.getDato().getId()) {
                        u = u.getAnterior();  // avanza hacia el nodo anterior
                        c = c.getSiguiente();  // avanza hacia el nodo siguiente
                    } // final while
                    c = c.getAnterior();  // se retrocede un nodo

                    if (c.getDato().getId() < persona.getId() && persona.getId() < c.getSiguiente().getDato().getId()) {
                        // verifica si el ID del nuevo dato está entre dos nodos
                        NodoListaDobleCircular temp = new NodoListaDobleCircular(persona);  // crea un nuevo nodo con el dato
                        temp.setAnterior(c);  // se asigna el anterior del nuevo nodo como el nodo anterior
                        temp.setSiguiente(c.getSiguiente());  // se asigna el siguiente del nuevo nodo como el siguiente del nodo anterior
                        c.getSiguiente().setAnterior(temp);  // se asigna el anterior del nodo siguiente del nodo anterior como el nuevo nodo
                        c.setSiguiente(temp);  // se asigna el siguiente del nodo anterior como el nuevo nodo
                    } else if (u.getDato().getId() < persona.getId() && persona.getId() < u.getSiguiente().getDato().getId()) {
                        // verifica si el ID del nuevo dato está entre el último nodo y la cabeza
                        NodoListaDobleCircular temp = new NodoListaDobleCircular(persona);  // crea un nuevo nodo con el dato
                        temp.setAnterior(u);  // se asigna el anterior del nuevo nodo como el último
                        temp.setSiguiente(u.getSiguiente());
                        u.getSiguiente().setAnterior(temp);
                        u.setSiguiente(temp);

                    }//final else if
                }//final else
            }//final else
        }//Final else
    }//final del metodo insertarMejorado

    public void insertarMejoradoAnimal(Animal animal) {
        // paso 1, de la presentación
        if (cabeza == null) {  // ver si la lista no esta vacia
            cabeza = new NodoListaDobleCircular(animal);
            ultimo = cabeza;  // asigna el nuevo nodo como el último también
            cabeza.setAnterior(ultimo);  // asigna el nodo anterior de la cabeza como el último
            cabeza.setSiguiente(ultimo);  // asigna el nodo siguiente de la cabeza como el último
            ultimo.setSiguiente(cabeza);  // asigna el siguiente del último como la cabeza (lista circular)
            ultimo.setAnterior(cabeza);  // asigna el anterior del último como la cabeza (lista circular)
        } else {
            // paso 2, de la presentación
            if (cabeza.getAnimal().getId() > animal.getId()) {  // verifica si el ID del primer elemento es mayor al nuevo dato
                NodoListaDobleCircular aux = new NodoListaDobleCircular(animal);  // crea un nuevo nodo con el dato
                aux.setSiguiente(cabeza);  // se asigna el siguiente del nuevo nodo como la cabeza actual
                cabeza.setAnterior(aux);  // se asigna el anterior de la cabeza actual como el nuevo nodo
                cabeza = aux;  // se asigna el nuevo nodo como la nueva cabeza
                cabeza.setAnterior(ultimo);  // se asigna el anterior de la nueva cabeza como el último
                ultimo.setSiguiente(cabeza);  // se asigna el siguiente del último como la nueva cabeza
            } else {
                // paso 3, de la presentación
                if (animal.getId() > ultimo.getAnimal().getId()) {  // verifica si el ID del nuevo dato es mayor al último elemento
                    NodoListaDobleCircular aux = new NodoListaDobleCircular(animal);  // crea un nuevo nodo con el dato
                    aux.setAnterior(ultimo);  // se asigna el anterior del nuevo nodo como el último
                    ultimo.setSiguiente(aux);  // se asigna el siguiente del último como el nuevo nodo
                    ultimo = aux;  // se asigna el nuevo nodo como el nuevo último
                    ultimo.setSiguiente(cabeza);  // se asigna el siguiente del último como la cabeza
                    cabeza.setAnterior(ultimo);  // se asigna el anterior de la cabeza como el último
                } else {
                    // paso 4
                    // se tien que hacer dos variables 
                    NodoListaDobleCircular c = cabeza;  // declaración de una variable para recorrer la lista desde la cabeza
                    NodoListaDobleCircular u = ultimo;  // declaración de una variable para recorrer la lista desde el último

                    while (c.getAnimal().getId() <= animal.getId() && animal.getId() <= u.getAnimal().getId()) {
                        u = u.getAnterior();  // avanza hacia el nodo anterior
                        c = c.getSiguiente();  // avanza hacia el nodo siguiente
                    } // final while
                    c = c.getAnterior();  // se retrocede un nodo

                    if (c.getAnimal().getId() < animal.getId() && animal.getId() < c.getSiguiente().getAnimal().getId()) {
                        // verifica si el ID del nuevo dato está entre dos nodos
                        NodoListaDobleCircular temp = new NodoListaDobleCircular(animal);  // crea un nuevo nodo con el dato
                        temp.setAnterior(c);  // se asigna el anterior del nuevo nodo como el nodo anterior
                        temp.setSiguiente(c.getSiguiente());  // se asigna el siguiente del nuevo nodo como el siguiente del nodo anterior
                        c.getSiguiente().setAnterior(temp);  // se asigna el anterior del nodo siguiente del nodo anterior como el nuevo nodo
                        c.setSiguiente(temp);  // se asigna el siguiente del nodo anterior como el nuevo nodo
                    } else if (u.getAnimal().getId() < animal.getId() && animal.getId() < u.getSiguiente().getAnimal().getId()) {
                        // verifica si el ID del nuevo dato está entre el último nodo y la cabeza
                        NodoListaDobleCircular temp = new NodoListaDobleCircular(animal);  // crea un nuevo nodo con el dato
                        temp.setAnterior(u);  // se asigna el anterior del nuevo nodo como el último
                        temp.setSiguiente(u.getSiguiente());
                        u.getSiguiente().setAnterior(temp);
                        u.setSiguiente(temp);

                    }//final else if
                }//final else
            }//final else
        }//Final else
    }//final del metodo insertarMejoradoAnimal  

    public void imprimirRecursivo() {
        NodoListaDobleCircular aux = ultimo; //el ultimo para la recursividad
        imprimirR(aux);//se llama al metodo recursdivo
    }//final del metodo imprimirRecursivo

    private void imprimirR(NodoListaDobleCircular aux) {
        if (aux == cabeza) { //esto es para que se imprima la cabea al final
            System.out.println(aux.getDato());
        }//final if
        else {
            System.out.println(aux.getDato()); //si no es la cabeza se imprime el dato
            imprimirR(aux.getAnterior());//se llama al nodo anterior
        }//Final else
    }//final del metodo imprimirRecursivo

    public String AnteriorAnteriorDelNodo(int id) {
        String msj = "No se ha encontrado el id"; //mensaje en caso de no encontrar el id
        if (cabeza != null) { //para que la lista no estea vacia
            NodoListaDobleCircular aux = cabeza; //para empezar desde la cabeza de la lista
            if (aux.getAnimal().getId() == id) { //si el aux coincide se actualiza el mensaje
                msj = "El anterior del anterior es: " + aux.getAnterior().getAnterior().getAnimal();
            }//final if
            aux = aux.getSiguiente();
            while (aux != cabeza) { //para no dar otra vuelta a la lista
                if (aux.getAnimal().getId() == id) { // si el aux coincide con el id se actualiza el mensaje
                    msj = "El anterior del anterior es: " + aux.getAnterior().getAnterior().getAnimal();
                    break;
                }//final if
                else {
                    aux = aux.getSiguiente(); //para avanzar en la lista
                }//Final else
            }//final while
        }//Final if 
        return msj; //devolver el mensaje
    }//Final del metodo AnteriorAnteriorDelNodo

    @Override
    public String toString() {
        // Inicializa la cadena de respuesta con una descripción de la lista
        String respuesta = "Lista doble circular: \n";

        // Verifica si la lista no está vacía
        if (cabeza != null) {
            // Crea un nodo auxiliar y lo inicializa con el nodo cabeza
            NodoListaDobleCircular aux = cabeza;

            // Agrega la representación en cadena del nodo actual a la respuesta
            respuesta += aux.toString() + "\n";

            // Avanza al siguiente nodo
            aux = aux.getSiguiente();

            // Itera sobre la lista mientras el nodo auxiliar no sea igual al nodo cabeza
            while (aux != cabeza) {
                // Agrega la representación en cadena del nodo actual a la respuesta
                respuesta += aux.toString() + "\n";

                // Avanza al siguiente nodo
                aux = aux.getSiguiente();
            }
        } else {
            // Si la lista está vacía, agrega un mensaje indicando lo mismo a la respuesta
            respuesta += "Vacía";
        }

        // Devuelve la cadena de respuesta que contiene la representación de la lista
        return respuesta;
    }
}//final de la clase
