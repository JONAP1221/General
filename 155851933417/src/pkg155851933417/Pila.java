
package pkg155851933417;

/**
 *
 * @author Jonathan
 */
public class Pila {
    //atributos de la clase
    private NodoPila cima;
    
    public Pila(){
        this.cima=null;
    }//final constructor vacio
    
    public boolean esVacia(){
        return cima==null;
    }//final metodo esVacia
    
    public void apilar(Animal a){
        NodoPila nueva = new NodoPila();
        nueva.setElemento(a);
        if (esVacia()) {
            cima=nueva;
        }//final if
        else{
            nueva.setSiguiente(cima);
            cima=nueva;
        }//final else
    }//final del metodo apilar
    
    public void eliminarTipo(Animal.tipo tipo){
        if (!esVacia()) {
            NodoPila actual = cima;
            NodoPila aux = null;
            while (actual !=null) {
                if (actual.getElemento().getTipo().equals(tipo)) {
                    if (aux == null) {// si el elemento actual coincide y esta de primero se elimina
                        cima = actual.getSiguiente();
                    }//final if
                    else{//en caso de que el elemento este en medio de la pila
                        aux.setSiguiente(actual.getSiguiente());
                    }//final else
                }//Final if
                else{
                    //actualizamos la informacion de la pila
                    aux = actual;
                }//final else
                //avanzamos por la pila
                actual = actual.getSiguiente();
            }//final while
        }//final if
    }//final del metodo eliminarTipo
    

    @Override
    public String toString() {
        String s = "";
        if (!esVacia()) {
            NodoPila aux = cima;
            while (aux != null) {                
                s = s+aux.getElemento().getTipo()+"\n";
                aux = aux.getSiguiente();
            }//Final while
        }//final if
        return s;
    }//final metodo toString
    
    
    
}//final de la clase
