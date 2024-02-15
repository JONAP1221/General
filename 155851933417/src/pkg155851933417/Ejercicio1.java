/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg155851933417;

import java.time.LocalDate;

/**
 *
 * @author Jonathan
 */
public class Ejercicio1 {

    public static void ejercicio(){
        Pila p = new Pila();
        Animal a = new Animal(LocalDate.now(), Animal.tipo.Delfín, "Numero 1");
        Animal b = new Animal(LocalDate.now(), Animal.tipo.Perro, "Numero 2");
        Animal c = new Animal(LocalDate.now(), Animal.tipo.Tortuga, "Numero 3");
        Animal d = new Animal(LocalDate.now(), Animal.tipo.Delfín, "Numero 4");
        Animal e = new Animal(LocalDate.now(), Animal.tipo.Tortuga, "Numero 5");
        Animal f = new Animal(LocalDate.now(), Animal.tipo.Tortuga, "Numero 6");
        Animal g = new Animal(LocalDate.now(), Animal.tipo.Tortuga, "Numero 7");
        Animal h = new Animal(LocalDate.now(), Animal.tipo.Delfín, "Numero 8");
        Animal i = new Animal(LocalDate.now(), Animal.tipo.Perro, "Numero 9");
        Animal j = new Animal(LocalDate.now(), Animal.tipo.Perro, "Numero 10");
        p.apilar(j);
        p.apilar(i);
        p.apilar(h);
        p.apilar(g);
        p.apilar(f);
        p.apilar(e);
        p.apilar(d);
        p.apilar(c);
        p.apilar(b);
        p.apilar(a);
        p.eliminarTipo(Animal.tipo.Delfín);
        System.out.println("La nueva pila es la siguiente: \n"+p);
    }//final del metodo ejercicio
}//final clase
