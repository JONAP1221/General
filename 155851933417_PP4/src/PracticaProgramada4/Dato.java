
package PracticaProgramada4;

/**
 *
 * @author Jonathan
 */
public class Dato {
    private String nombre;
    private int id;

    public Dato(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }//final constructor

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int aux) {
        this.id = aux;
    }
    
    
    
}//final de la clase
