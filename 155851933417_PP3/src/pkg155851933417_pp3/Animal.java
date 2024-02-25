package pkg155851933417_pp3;

import java.time.LocalDate;

/**
 *
 * @author Jonathan
 */
public class Animal {

    //atributos de la clase
    private int id;
    private String nombre;
    private Tipo tipo;
    private LocalDate fechaNacimiento;

    public enum Tipo {
        Tortuga, Pez, Insecto;
    }//final enum

    public Animal() {
    }//final constructor vacio

    public Animal(int id, String nombre, Tipo tipo, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaNacimiento = fechaNacimiento;
    }//final constructor lleno

    //gets and sets
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

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }//final gets and sets

    @Override
    public String toString() {
        return "ID: " + id + "\n nombre: " + nombre + " Tipo: " + tipo + "\n Fecha de Nacimiento=" + fechaNacimiento + "\n";
    }

}//final de la clase
