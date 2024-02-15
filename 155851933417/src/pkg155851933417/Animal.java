
package pkg155851933417;

import java.time.LocalDate;

/**
 *
 * @author Jonathan
 */
public class Animal {
    //atributos de la clase
    private LocalDate fechaNacimiento;
    private tipo tipo;
    private String nombre;

    public Animal() {
    }//final constructor vacío

    public Animal(LocalDate fechaNacimiento, tipo tipo, String nombre) {
        this.fechaNacimiento = fechaNacimiento;
        this.tipo = tipo;
        this.nombre = nombre;
    }//final constructor lleno

    //gets and sets
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Enum getTipo() {
        return tipo;
    }

    public void setTipo(tipo tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//final gets and sets
    
    public enum tipo{
    Tortuga, Delfín, Perro;
    }//final enum
    
}//final de la clase
