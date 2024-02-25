
package casoestudio1jonathanlopezgarcia;

/**
 *
 * @author Jonathan
 */
public class Tarea {
    //atributos de la clase
    private String id, nombre;
    private int tiempoProcesamiento;

    public Tarea(String id, String nombre, int tiempoProcesamiento) {
        this.id = id;
        this.nombre = nombre;
        this.tiempoProcesamiento = tiempoProcesamiento;
    }//final constructor vacio

    //gets and sets
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoProcesamiento() {
        return tiempoProcesamiento;
    }

    public void setTiempoProcesamiento(int tiempoProcesamiento) {
        this.tiempoProcesamiento = tiempoProcesamiento;
    }//final gets and sets

    @Override
    public String toString() {
        return "Identificador: " + id + "\n Nombre: " + nombre + "\n Tiempo de Procesamiento: " + tiempoProcesamiento/60 +"mins.\n";
    }//final metodo toString
    
    
    
    
    
}//final de la clase
