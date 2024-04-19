package pkg155851933417_cp3;

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

    public void inOrden() { //metodo visto en clase
        if (root != null) {
            inOrderR(root);
        }//final if
        else {
            JOptionPane.showMessageDialog(null, "Árbol vacío...");
        }//Final else
    }//final del metodo inOrden

    private void inOrderR(NodoArbol root) { //ya visto en clase
        if (root != null) {
            inOrderR(root.getNodoIzq());
            System.out.print(root.getDato().getNombre() + " ");
            inOrderR(root.getNodoDer());
        }//final if
    }//final del metodo inOrderR

    public void inOrdenValor(String a) { //metodo visto en clase
        if (root != null) {
            inOrderR(root, a);
        }//final if
        else {
            JOptionPane.showMessageDialog(null, "Árbol vacío...");
        }//Final else
    }//final del metodo inOrden

    private void inOrderR(NodoArbol root, String a) { //ya visto en clase
        if (root != null) {
            if (root.getDato().getNombre().equals("A")) {
                root.getDato().setNombre(a);
            }//final if
            inOrderR(root.getNodoIzq(), a);
            System.out.print(root.getDato().getNombre() + " ");
            inOrderR(root.getNodoDer(), a);
        }//final if
    }//final del metodo inOrderR

    public int evaluarArbol(String pA) {
        inOrdenValor(pA);
        return evaluarArbolR(root); //llama al metodo evaluarArbolR
    }//final del metodo evaluarArbol

    private int evaluarArbolR(NodoArbol nodo) { //visto en clase
        if (nodo != null) {//si es diferente de nulo
            switch (nodo.getDato().getNombre()) {
                case "/" -> { //en caso de ser division
                    if (nodo.getNodoDer().getDato().getNombre() == "0") {
                        JOptionPane.showMessageDialog(null, "No se puede dividir entre cero.");
                    }//final if
                    else {
                        return evaluarArbolR(nodo.getNodoIzq()) / evaluarArbolR(nodo.getNodoDer()); //recorre el resto de la ramas o niveles
                    }//final else
                }//final case
                case "*" -> { //en caso de multiplicacion
                    return evaluarArbolR(nodo.getNodoIzq()) * evaluarArbolR(nodo.getNodoDer());//recorre el resto de la ramas o niveles
                }//final case
                case "+" -> { //en caso de resta
                    return evaluarArbolR(nodo.getNodoIzq()) + evaluarArbolR(nodo.getNodoDer());//recorre el resto de la ramas o niveles
                }//final case
                case "^" -> {//en caso de suma
                    return (int) Math.pow(evaluarArbolR(nodo.getNodoIzq()), evaluarArbolR(nodo.getNodoDer()));//recorre el resto de la ramas o niveles
                }//final case
                default -> {//devuelve el valor como entero si no tiene una operacion 
                    return Integer.parseInt((nodo.getDato().getNombre()));
                }//final default
            }//final switch
        }//final if
        return 0; //de lo contrario devuelve 0
    }//final del metodo evaluarArbolR

}//final de la clase
