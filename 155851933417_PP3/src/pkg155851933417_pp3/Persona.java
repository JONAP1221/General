package pkg155851933417_pp3;

import java.time.LocalDate;

/**
 *
 * @author Jonathan
 */
public class Persona {

    //atributos de la clase
    private String nombre, apellido;
    private LocalDate fechaNacimiento;
    private int id;

    public Persona(int id, String nombre, String apellido, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }//final constructor lleno

    public Persona() {
    }//final constructor vacio

    //Gets and sets
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }//final gets and sets

    @Override
    public String toString() {
        return "ID: " + id + "\n nombre: " + nombre + " "
                + apellido + "\n Fecha de Nacimiento: " + fechaNacimiento;
    }//Final metodo toString

}//final de la clase
