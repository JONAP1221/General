
package practica;

public class Cola {
    private NodoCola primero;
    private NodoCola atras;
    
    public Cola() {
        this.primero = null;
        this.atras = null;
    }
    
    public boolean esVacia() {
        return primero == null;
    }
    
    public void encolar(int numero) {
        NodoCola nuevo = new NodoCola(numero);
        if (esVacia()) {
            primero = nuevo;
            atras = nuevo;
        } else {
            atras.setSiguiente(nuevo);
            atras = nuevo;
        }
    }
    
    public int desencolar() {
        if (esVacia()) {
            return 0;
        } else {
            int numero = primero.getNumero();
            primero = primero.getSiguiente();
            if (primero == null) {
                atras = null;
            }
            return numero;
        }
    }

    @Override
    public String toString() {
        String msj="";
        NodoCola aux = primero;
        while (aux != null) {            
            msj = msj+"Numero: "+aux.getNumero()+"\n";
            aux = aux.getSiguiente();
        }//final while
        return msj;
    }
}
