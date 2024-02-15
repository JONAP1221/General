
package pkg155851933417;

import java.time.LocalDate;

/**
 *
 * @author Jonathan
 */
public class Persona {
    //atributos de la clase
    private String nombre, apellido, cedula;
    private LocalDate fechaNacimiento;
    private sexo genero;

    public Persona(String nombre, String apellido, String cedula, LocalDate fechaNacimiento, sexo genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }//final constructor lleno
    
    public Persona(){ 
    }//final constructor vacio

    //gets and sets
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public sexo getGenero() {
        return genero;
    }

    public void setGenero(sexo genero) {
        this.genero = genero;
    }//final gets and sets
    
    public enum sexo{
        M, F;
    }//final del enum
    
}//final de la clase
