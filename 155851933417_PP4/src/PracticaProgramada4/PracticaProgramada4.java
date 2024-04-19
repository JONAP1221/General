package PracticaProgramada4;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class PracticaProgramada4 {

    public static void hola() {
        int opcion = 0;
        while (opcion != 4) {
            try {//para el manejo de errores
                opcion = Integer.parseInt(JOptionPane.showInputDialog("\n Digite una opcion:\n1- Ejercicio 1\n 2- Ejercicio 2\n 3- Ejercicio 3\n 4- Salir"));
                switch (opcion) {
                    case 1:
                        ejercicio1();
                        break;
                    case 2:
                        ejercicio2();
                        break;
                    case 3:
                        ejercicio3();
                        break;
                    case 4:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Digite una opción valida.");
                }//final switch
            }//final try
            catch (Exception e) {
                System.out.println("Error capa 8: " + e.getMessage());
            }//final catch
        }//final while
    }//final del metodo hola

    public static void ejercicio1() {
        Arbol arbol = new Arbol();
        arbol.inserta(new Dato("50", 50));
        arbol.inserta(new Dato("20", 20));
        arbol.inserta(new Dato("80", 80));
        arbol.inserta(new Dato("15", 15));
        arbol.inserta(new Dato("30", 30));
        arbol.inserta(new Dato("60", 60));
        arbol.inserta(new Dato("40", 40));
        arbol.inserta(new Dato("90", 90));
        arbol.inserta(new Dato("75", 75));
        arbol.inserta(new Dato("33", 33));
        arbol.inserta(new Dato("82", 82));

        System.out.println("Camino que recorre para llegar al nodo: ");
        ListaSimple lista = arbol.busca(82);

        JOptionPane.showMessageDialog(null, "\nLista ordenada con los nodos recorridos:\n" + lista);
    }//final del metodo ejercicio1

    public static void ejercicio2() {
        Arbol arbol2 = new Arbol();
        arbol2.inserta(new Dato("/", 50));
        arbol2.inserta(new Dato("4", 80));
        arbol2.inserta(new Dato("*", 10));
        arbol2.inserta(new Dato("2", 9));
        arbol2.inserta(new Dato("+", 20));
        arbol2.inserta(new Dato("3", 19));
        arbol2.inserta(new Dato("/", 30));
        arbol2.inserta(new Dato("6", 29));
        arbol2.inserta(new Dato("2", 31));

        JOptionPane.showMessageDialog(null, "Valor del árbol evauado: " + arbol2.evaluarArbol());
    }//final del metodo ejercicio2

    public static void ejercicio3() {
        Arbol arbol3 = new Arbol();
        arbol3.inserta(new Dato("15", 15));
        arbol3.inserta(new Dato("11", 11));
        arbol3.inserta(new Dato("12", 12));
        arbol3.inserta(new Dato("14", 14));
        arbol3.inserta(new Dato("8", 8));
        arbol3.inserta(new Dato("6", 6));
        arbol3.inserta(new Dato("9", 9));
        arbol3.inserta(new Dato("26", 26));
        arbol3.inserta(new Dato("20", 20));
        arbol3.inserta(new Dato("30", 30));
        arbol3.inserta(new Dato("35", 35));

        JOptionPane.showMessageDialog(null, "El total de la suma del árbol es: " + arbol3.suma());
    }//final del metodo ejercicio3
}//final de la clase
