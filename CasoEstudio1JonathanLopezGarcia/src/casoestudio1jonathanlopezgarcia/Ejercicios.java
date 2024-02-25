
package casoestudio1jonathanlopezgarcia;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Ejercicios {
    
    public static void ejercicio1(){
        try{
            ColaSupermercado d = new ColaSupermercado();
            Articulo a = new Articulo(JOptionPane.showInputDialog("Digite el nombre del articulo"), Integer.parseInt(JOptionPane.showInputDialog("Digite el precio unitario: ")), Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad de articulos: ")), 0);
            Articulo b = new Articulo(JOptionPane.showInputDialog("Digite el nombre del articulo"), Integer.parseInt(JOptionPane.showInputDialog("Digite el precio unitario: ")), Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad de articulos: ")), 0);
            Articulo c = new Articulo(JOptionPane.showInputDialog("Digite el nombre del articulo"), Integer.parseInt(JOptionPane.showInputDialog("Digite el precio unitario: ")), Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad de articulos: ")), 0);
            d.encolar(a);
            d.encolar(b);
            d.encolar(c);
            JOptionPane.showMessageDialog(null, "El total a pagar es de: "+d.totalFactura()+"$");
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
    }//final catch
    }//final del metodo ejercicio1
    
    public static void ejercicio2(){
        try{
        PilaUsandoCola z = new PilaUsandoCola();
        for (int i = 0; i < 10; i++) {
            Tarea t = new Tarea(JOptionPane.showInputDialog("Digite el identificador de la tarea: "), JOptionPane.showInputDialog("Digite el nombre de la tarea"), Integer.parseInt(JOptionPane.showInputDialog("Digite el tiempo de la tarea en segundos: ")));
            z.apilar(t);
        }//final for
        JOptionPane.showMessageDialog(null, z+"\n");
        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
    }//final metodo ejercicio2
    
}//final de la clase
