
package semana8estructuradedatos;

/**
 *
 * @author Jonathan
 */
public class NodoListaSimple {
    private Persona persona;
    private NodoListaSimple siguiente;
 
    public NodoListaSimple(Persona persona) {
        this.persona = persona;
    }
 
    public Persona getPersona() {
        return persona;
    }
 
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
 
    public NodoListaSimple getSiguiente() {
        return siguiente;
    }
 
    public void setSiguiente(NodoListaSimple siguiente) {
        this.siguiente = siguiente;
    }
 
    @Override
    public String toString() {
        return "NodoListaSimple{" + "dato=" + persona + '}';
    }
}//final de la clase
