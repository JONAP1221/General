
package pkg155851933417;

/**
 *
 * @author Jonathan
 */
public class Cola {
    //atributos de la clase
    private NodoCola primero;
    private NodoCola ultimo;
    
    public Cola(){
        this.primero=null;
        this.ultimo=null;
    }//final constructor vacio
    
    public boolean esVacia(){
        return primero==null;
    }//final metodo esVacia
    
    public void encolar(Persona elemento) {
        NodoCola nuevoNodo = new NodoCola(elemento);
        if (esVacia()) {//si esta vacia se agrega
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        }//final if 
        else {//si ya tenia un elemento antes lo pone de ultimo
            ultimo.setSiguiente(nuevoNodo);
            ultimo = nuevoNodo;
        }//final else
    }//final metodo encolar
    
    public int conteoPorSexo(Persona.sexo sexo){
        //primero para ir desde el primero hasta el ultimo
        return contarR(primero, sexo);
    }//final del metodo conteoPorSexo
    
    private int contarR(NodoCola nodo, Persona.sexo sexo){
        int contador = 0;
        if (nodo == null) {//si es nulo devuelve 0
            return 0;
        }//final if
        if (nodo.getElemento().getGenero().equals(sexo)) {//si coincide agrega 1 al contador
            contador = 1;
        }//final if
        return contador + contarR(nodo.getSiguiente(), sexo);//al terminar se mueve al siguiente en la cola y le suma el contador
    }//final del metodo contarR

    @Override
    public String toString() {
        String s = "";
        if (!esVacia()) {
            NodoCola aux = primero;
            while (aux != null) {                
                s = s+aux.getElemento().getApellido()+"\n";
                aux = aux.getSiguiente();
            }//Final while
        }//final if
        return s;
    }//final metodo toString
    
    
    
}//final de la clase
