/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana8estructuradedatos;

/**
 *
 * @author deivert.guiltrichs
 */
public class ListaDobleCircular {

    private NodoListaCircularDoble cabeza;
    private NodoListaCircularDoble ultimo;

    public void inserta(Persona p) {
        //Paso 1, de la presentación
        if (cabeza == null) {
            cabeza = new NodoListaCircularDoble(p);
            ultimo = cabeza;
            cabeza.setAnterior(ultimo);
            cabeza.setSiguiente(ultimo);
            ultimo.setSiguiente(cabeza);
            ultimo.setAnterior(cabeza);
        } else {
            //Paso 2, de la presentación
            if (cabeza.getDato().getId() > p.getId()) {
                NodoListaCircularDoble aux = new NodoListaCircularDoble(p);
                aux.setSiguiente(cabeza);
                cabeza.setAnterior(aux);
                cabeza = aux;
                cabeza.setAnterior(ultimo);
                ultimo.setSiguiente(cabeza);
            } else {
                //Paso 3, de la presentación
                if (p.getId() > ultimo.getDato().getId()) {
                    NodoListaCircularDoble aux = new NodoListaCircularDoble(p);
                    aux.setAnterior(ultimo);
                    ultimo.setSiguiente(aux);
                    ultimo = aux;
                    ultimo.setSiguiente(cabeza);
                    cabeza.setAnterior(ultimo);
                } else {
                    //Paso 4, de la presentación
                    NodoListaCircularDoble aux = cabeza.getSiguiente();
                    while (aux.getDato().getId() < p.getId()) {
                        aux = aux.getSiguiente();
                    }

                    NodoListaCircularDoble temp = new NodoListaCircularDoble(p);
                    temp.setAnterior(aux.getAnterior());
                    temp.setSiguiente(aux); //Acá aux.getAnterior está apuntando (en su siguiente) a aux
                    aux.setAnterior(temp);
                    temp.getAnterior().setSiguiente(temp);
                }
            }
        }
    }

    public void insertaMejorado(Persona p) {
        //Paso 1, de la presentación
        if (cabeza == null) {
            cabeza = new NodoListaCircularDoble(p);
            ultimo = cabeza;
            cabeza.setAnterior(ultimo);
            cabeza.setSiguiente(ultimo);
            ultimo.setSiguiente(cabeza);
            ultimo.setAnterior(cabeza);
        } else {
            //Paso 2, de la presentación
            if (cabeza.getDato().getId() > p.getId()) {
                NodoListaCircularDoble aux = new NodoListaCircularDoble(p);
                aux.setSiguiente(cabeza);
                cabeza.setAnterior(aux);
                cabeza = aux;
                cabeza.setAnterior(ultimo);
                ultimo.setSiguiente(cabeza);
            } else {
                //Paso 3, de la presentación
                if (p.getId() > ultimo.getDato().getId()) {
                    NodoListaCircularDoble aux = new NodoListaCircularDoble(p);
                    aux.setAnterior(ultimo);
                    ultimo.setSiguiente(aux);
                    ultimo = aux;
                    ultimo.setSiguiente(cabeza);
                    cabeza.setAnterior(ultimo);
                } else {
                    NodoListaCircularDoble c = cabeza;
                    NodoListaCircularDoble u = ultimo;
                    while (u.getDato().getId() < p.getId() && c.getDato().getId() > p.getId()) {
                        u = u.getAnterior();
                        c = u.getAnterior();
                        if (u.getDato().getId() > p.getId()) {
                            NodoListaCircularDoble temp = new NodoListaCircularDoble(p);
                            temp.setAnterior(u.getAnterior());
                            temp.setSiguiente(u); //Acá c.getAnterior está apuntando (en su siguiente) a c
                            u.setAnterior(temp);
                            temp.getAnterior().setSiguiente(temp);
                            break;
                        }//Final if
                        else if (c.getDato().getId() < p.getId()) {
                            NodoListaCircularDoble temp = new NodoListaCircularDoble(p);
                            temp.setAnterior(c.getAnterior());
                            temp.setSiguiente(c); //Acá aux.getAnterior está apuntando (en su siguiente) a aux
                            c.setAnterior(temp);
                            temp.getAnterior().setSiguiente(temp);
                            break;
                        }
                    }//final while
                }
            }
        }
    }

    @Override
    public String toString() {
        String respuesta = "Lista doble circular: \n";

        if (cabeza != null) {
            NodoListaCircularDoble aux = cabeza;

            respuesta += aux.toString() + "\n";

            aux = aux.getSiguiente();

            while (aux != cabeza) {
                respuesta += aux.toString() + "\n";
                aux = aux.getSiguiente();
            }
        } else {
            respuesta += "Vacía";
        }

        return respuesta;
    }

}
