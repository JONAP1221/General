package pkg155851933417_cp3;

/**
 *
 * @author Jonathan
 */
public class Objeto {

    private int id;
    private String nombre;

    public Objeto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return ""+nombre;
    }

    
}
