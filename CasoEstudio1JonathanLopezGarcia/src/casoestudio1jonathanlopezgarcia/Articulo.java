
package casoestudio1jonathanlopezgarcia;

/**
 *
 * @author Jonathan
 */
public class Articulo {
    
    private String nombre;
    private int cantidad;
    private double precioUnitario, precioTotal;

    public Articulo() {
    }//final del constructor vacio

    public Articulo(String nombre, int cantidad, double precioUnitario, double precioTotal) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precioTotal = precioTotal;
    }//final del constructor lleno

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + "\n cantidad: " + cantidad + "\n precioUnitario: " + precioUnitario + "\n precioTotal: " + precioTotal;
    }//final metodo toString
    
    
    
}//Final de la clase
