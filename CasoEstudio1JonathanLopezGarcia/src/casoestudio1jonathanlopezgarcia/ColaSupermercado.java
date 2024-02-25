
package casoestudio1jonathanlopezgarcia;

/**
 *
 * @author Jonathan
 */
public class ColaSupermercado {
    //atributos de la clase
    private NodoSupermercado primero;
    private NodoSupermercado ultimo;
    
    public ColaSupermercado(){
        this.primero=null;
        this.ultimo=null;
    }//final constructor vacio
    
    public boolean esVacia(){
        return primero==null;
    }//final metodo esVacia
    
    public void encolar(Articulo elemento) {
        NodoSupermercado nuevoNodo = new NodoSupermercado(elemento);
        if (esVacia()) {//si esta vacia se agrega
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        }//final if 
        else {//si ya tenia un elemento antes lo pone de ultimo
            ultimo.setAtras(nuevoNodo);
            ultimo = nuevoNodo;
        }//final else
    }//final metodo encolar
    
public double totalFactura(){
    return facturaRecursivo(primero, 0);
}

private double facturaRecursivo(NodoSupermercado nodo, double total){
    double totalFinal = total;
    if (nodo == null) {
        return total; // Devolver el total acumulado cuando llegamos al final de la lista
    }
    totalFinal = totalFinal+ (nodo.getDato().getPrecioUnitario() * nodo.getDato().getCantidad());//suma la cantidad por el precio
    return totalFinal + facturaRecursivo(nodo.getAtras(), total);//lo hace con los demás
}

}//final clase

