
package CasoEstudio2;

import java.time.LocalDate;

/**
 *
 * @author Jonathan
 */
public class Persona {

    private int id;
    private String nombre;
    private String apellido;
    private LocalDate fecha;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, LocalDate fecha) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fecha=" + fecha + '}';
    }
    
}
