
package pkg155851933417;

import java.time.LocalDate;

/**
 *
 * @author Jonathan
 */
public class Ejercicio2 {
    public static void ejercicio(){
        Cola x = new Cola();
        Persona a = new Persona("Joan", "García", "111", LocalDate.now(), Persona.sexo.F);
        Persona b = new Persona("Juan", "Martínez", "222", LocalDate.now(), Persona.sexo.M);
        Persona c = new Persona("Emilie", "Rodríguez", "333", LocalDate.now(), Persona.sexo.F);
        Persona d = new Persona("Jonathan", "López", "444", LocalDate.now(), Persona.sexo.M);
        Persona e = new Persona("Daniela", "Robles", "555", LocalDate.now(), Persona.sexo.F);
        Persona f = new Persona("Dereck", "Marín", "666", LocalDate.now(), Persona.sexo.M);
        Persona g = new Persona("Fabricio", "Pérez", "777", LocalDate.now(), Persona.sexo.M);
        Persona h = new Persona("Alana", "Gonzáles", "888", LocalDate.now(), Persona.sexo.F);
        Persona i = new Persona("Vanessa", "Díaz", "999", LocalDate.now(), Persona.sexo.F);
        Persona j = new Persona("Josmara", "Romero", "000", LocalDate.now(), Persona.sexo.F);
        x.encolar(a);
        x.encolar(b);
        x.encolar(c);
        x.encolar(d);
        x.encolar(e);
        x.encolar(f);
        x.encolar(g);
        x.encolar(h);
        x.encolar(i);
        x.encolar(j);
        System.out.println("Hay "+x.conteoPorSexo(Persona.sexo.F)+" personas del sexo seleccionado en la cola.");
    }//final metodo ejercicio
}
