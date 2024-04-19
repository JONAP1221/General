/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana8estructuradedatos;

/**
 *
 * @author deivert.guiltrichs
 */
public class NodoListaCircularDoble {
    private Persona dato;
    private NodoListaCircularDoble anterior;
    private NodoListaCircularDoble siguiente;

    public NodoListaCircularDoble(Persona dato) {
        this.dato = dato;
    } 

    public Persona getDato() {
        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public NodoListaCircularDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaCircularDoble anterior) {
        this.anterior = anterior;
    }

    public NodoListaCircularDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaCircularDoble siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return dato.toString();
    }
}
