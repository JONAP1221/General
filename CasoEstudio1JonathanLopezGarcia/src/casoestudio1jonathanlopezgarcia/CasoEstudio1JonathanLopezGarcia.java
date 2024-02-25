
package casoestudio1jonathanlopezgarcia;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class CasoEstudio1JonathanLopezGarcia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        int opci = Integer.parseInt(JOptionPane.showInputDialog("Digite el ejercicio para ejecutar: \n1- Ejercicio 1 \n 2- Ejercicio 2"));
        switch (opci) {
            case 1:
                Ejercicios.ejercicio1();
                break;
            case 2:
                Ejercicios.ejercicio2();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Elija una opcion valida");
        }
        }//final try
        catch(Exception e){
            System.out.println("Error: "+e.getMessage() );
        }//final catch
        
    }//Final del main
    
}//final de la clase
