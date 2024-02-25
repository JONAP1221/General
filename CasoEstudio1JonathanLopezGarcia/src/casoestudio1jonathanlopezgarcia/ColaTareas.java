/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio1jonathanlopezgarcia;

/**
 *
 * @author Jonathan
 */
public class ColaTareas {
    private NodoCola primero;
    private NodoCola atras;
    
    public ColaTareas() {
        this.primero = null;
        this.atras = null;
    }
    
    public boolean esVacia() {
        return primero == null;
    }
    
    public void encolar(Tarea dato) {
        NodoCola nuevo = new NodoCola(dato);
        if (esVacia()) {
            primero = nuevo;
            atras = nuevo;
        } else {
            atras.setSiguiente(nuevo);
            atras = nuevo;
        }
    }
    
    public Tarea desencolar() {
        if (esVacia()) {
            return null;
        } else {
            Tarea dato = primero.getDato();
            primero = primero.getSiguiente();
            if (primero == null) {
                atras = null;
            }
            return dato;
        }
    }

    @Override
    public String toString() {
        return "ColaTareas{" + "primero=" + primero.getDato().getNombre() + ", atras=" + atras.getDato().getNombre() + '}';
    }
    
    
    
}
