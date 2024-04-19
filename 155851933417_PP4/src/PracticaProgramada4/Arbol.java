package PracticaProgramada4;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Arbol {

    //atributo de la clase
    private NodoArbol root;

    public void inserta(Dato data) {
        if (root == null) {
            root = new NodoArbol(data);
        }//final if
        else {
            insertaR(root, data);
        }//Final else
    }//final del metodo inserta

    private void insertaR(NodoArbol nodo, Dato data) { //metodo visto en clase, sacado de la presentación
        if (data.getId() <= nodo.getDato().getId()) {
            if (nodo.getNodoIzq() == null) {
                nodo.setNodoIzq(new NodoArbol(data));
            }//final if
            else {
                insertaR(nodo.getNodoIzq(), data);
            }//Final else
        }//final if
        else {
            if (nodo.getNodoDer() == null) {
                nodo.setNodoDer(new NodoArbol(data));
            }//final if
            else {
                insertaR(nodo.getNodoDer(), data);
            }//Final else
        }//final else
    }//final del metodo insertaR

    public void PreOrden() { //metodo visto en clase
        if (root != null) {
            PreOrdenR(root);
        }//final if
        else {
            JOptionPane.showMessageDialog(null,"Árbol vacío...");
        }//Final else
    }//final del metodo inOrden

    private void PreOrdenR(NodoArbol root) { //ya visto en clase
        if (root != null) {
            System.out.println(root.getDato().getNombre() + " ");
            PreOrdenR(root.getNodoIzq());
            PreOrdenR(root.getNodoDer());
        }//final if
    }//final del metodo inOrderR

    public ListaSimple busca(int id) {
        return BuscaR(root, id, new ListaSimple()); //se llama al metodo recursivo
    }//final del metodo busca

    private ListaSimple BuscaR(NodoArbol nodo, int id, ListaSimple lista) {
        if (nodo == null) { //si la raiz es null o no se ha encontrado el nodo, se da un aviso
            JOptionPane.showMessageDialog(null, "No se ha encontrado el valor...");
            return null; //y el valor de la lista sera null
        }//final if
        else { //si contiene valores
            System.out.println(nodo.getDato().getNombre()); //muestra en la consola el nombre del nodo para mostrar el recorrido que hace
            lista.insertar(nodo.getDato()); //inserta el nodo en la listaSimple
            if (nodo.getDato().getId() == id) { //si encontro el nodo que se buscaba 
                return lista;                   //devuelve la lista
            }//final if
            else { //si no lo ha encontrado todavia
                if (id <= nodo.getDato().getId()) { //si el id a buscar es menor que el valor del nodo
                    return BuscaR(nodo.getNodoIzq(), id, lista); //lo buscara a la izquierda
                }//final if
                else { //en caso de ser mayor
                    return BuscaR(nodo.getNodoDer(), id, lista); //se busca a la derecha
                }//final else
            }//final else
        }//final else
    }//final del metodo BuscaR

    public int evaluarArbol() {
        return evaluarArbolR(root); //llama al metodo evaluarArbolR
    }//final del metodo evaluarArbol

    private int evaluarArbolR(NodoArbol nodo) { //visto en clase
        if (nodo != null) {//si es diferente de nulo
            switch (nodo.getDato().getNombre()) {
                case "/" -> { //en caso de ser division
                    return evaluarArbolR(nodo.getNodoIzq()) / evaluarArbolR(nodo.getNodoDer()); //recorre el resto de la ramas o niveles
                }//final case
                case "*" -> { //en caso de multiplicacion
                    return evaluarArbolR(nodo.getNodoIzq()) * evaluarArbolR(nodo.getNodoDer());//recorre el resto de la ramas o niveles
                }//final case
                case "-" -> { //en caso de resta
                    return evaluarArbolR(nodo.getNodoIzq()) - evaluarArbolR(nodo.getNodoDer());//recorre el resto de la ramas o niveles
                }//final case
                case "+" -> {//en caso de suma
                    return evaluarArbolR(nodo.getNodoIzq()) + evaluarArbolR(nodo.getNodoDer());//recorre el resto de la ramas o niveles
                }//final case
                default -> {//devuelve el valor como entero si no tiene una operacion 
                    return Integer.parseInt((nodo.getDato().getNombre()));
                }//final default
            }//final switch
        }//final if
        return 0; //de lo contrario devuelve 0
    }//final del metodo evaluarArbolR

    public int suma() { //casi lo mismo que el metodo pre-orden
        if (root != null) { //si no es nulo se llama a sumaR
            return sumaR(root);
        }//final if
        else { //Caso contrario se da el aviso
            JOptionPane.showMessageDialog(null,"El árbol está vacío...");
            return 0; //y se devuelve 0
        }//Final else
    }//final del metodo suma

    private int sumaR(NodoArbol root) {
        if (root != null) { //si root no es nulo
            int total = Integer.parseInt(root.getDato().getNombre()); //se crea el entero que contendra la suma total
            total = total + sumaR(root.getNodoIzq()); //se suma el total con el resultado del metodo recursivo
            total = total + sumaR(root.getNodoDer()); //lo mismo para la rama derecha
            return total; //se devuelve el total
        }//final if
        return 0; //en caso de ser nulo devolver 0
    }//final del metodo sumaR

}//final de la clase
