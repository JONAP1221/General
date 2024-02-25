package pkg155851933417_pp3;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Ejercicio {

    public static void e1() {

        Lista lista1 = new Lista();
        Persona p1 = new Persona(1, "Ramón", "Valdés", LocalDate.parse("1995-02-20"));
        Persona p2 = new Persona(2, "Luisa", "Rodriguez", LocalDate.parse("1976-12-02"));
        Persona p3 = new Persona(3, "Ramón", "Algo", LocalDate.parse("1983-05-24"));
        Persona p4 = new Persona(4, "Julian", "Aja", LocalDate.parse("2012-03-24"));
        Persona p5 = new Persona(5, "Julian", "Marruecos", LocalDate.parse("1997-08-12"));
        Persona p6 = new Persona(6, "Julian", "Araya", LocalDate.parse("1999-06-17"));
        Persona p7 = new Persona(7, "Jonathan", "López", LocalDate.parse("2005-01-19"));
        Persona p8 = new Persona(8, "Daniela", "Robles", LocalDate.parse("2005-02-20"));
        Persona p9 = new Persona(9, "Daniela", "Marín", LocalDate.parse("2002-03-18"));
        Persona p0 = new Persona(10, "Jonathan", "García", LocalDate.parse("2005-06-29"));
        lista1.insertar(p1);
        lista1.insertar(p2);
        lista1.insertar(p3);
        lista1.insertar(p4);
        lista1.insertar(p5);
        lista1.insertar(p6);
        lista1.insertar(p7);
        lista1.insertar(p8);
        lista1.insertar(p9);
        lista1.insertar(p0);
        System.out.println(lista1);
        JOptionPane.showMessageDialog(null, "Lista: \n" + lista1);
        lista1.eliminarNombresRepetidos();
        System.out.println("\n///////////////////////////////////////////////\n");
        System.out.println(lista1);
        JOptionPane.showMessageDialog(null, "Nueva lista: \n" + lista1);

    }//final del metodo e1

    public static void e2() {
        Lista lista1 = new Lista();
        Animal a1 = new Animal(1, "Susan", Animal.Tipo.Pez, LocalDate.parse("2015-01-01"));
        Animal a2 = new Animal(2, "Morgan", Animal.Tipo.Insecto, LocalDate.parse("2012-01-01"));
        Animal a3 = new Animal(3, "Delphi", Animal.Tipo.Tortuga, LocalDate.parse("2000-01-01"));
        Animal a4 = new Animal(4, "Huan", Animal.Tipo.Pez, LocalDate.parse("1999-01-01"));
        Animal a5 = new Animal(5, "Cesra", Animal.Tipo.Tortuga, LocalDate.parse("2005-06-19"));
        lista1.insertarAnimal(a1);
        lista1.insertarAnimal(a2);
        lista1.insertarAnimal(a3);
        lista1.insertarAnimal(a4);
        lista1.insertarAnimal(a5);
        JOptionPane.showMessageDialog(null, "Lista:\n\n" + lista1);
        System.out.println("Lista:\n" + lista1);
        lista1.extraccionPorFecha(LocalDate.parse("2005-06-19"));
        System.out.println("Lista actualizada:\n" + lista1);
        JOptionPane.showMessageDialog(null, "Lista actualizada:\n\n" + lista1);
    }//final del metodo e2

    public static void start() {
        try {
            int opci = 0;
            while (opci != 3) {
                opci = Integer.parseInt(JOptionPane.showInputDialog("Digite el ejercicio para ejecutar: \n 1- Ejercicio 1 \n 2- Ejercicio 2\n 3- Salir"));
                switch (opci) {
                    case 1:
                        e1();
                        break;
                    case 2:
                        e2();
                        break;
                    case 3:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Elija una opcion valida");
                }//final switch
            }//final while
        }//final try
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }//final catch
    }//final del metodo start

}//final de la clase
