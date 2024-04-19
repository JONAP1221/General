package pkg155851933417_pp5;

/**
 *
 * @author Jonathan
 */
public class Main {

    public static void main(String[] args) {
        
        GrafoConLista grafo = new GrafoConLista();
        // Agregar vértices
        Objeto a = new Objeto(1, "A");
        Objeto b = new Objeto(2, "B");
        Objeto c = new Objeto(3, "C");
        Objeto d = new Objeto(4, "D");
        
        grafo.agregarVertice(a);
        grafo.agregarVertice(b);
        grafo.agregarVertice(c);
        grafo.agregarVertice(d);
        // Agregar aristas
        grafo.agregarArista(1, 2);
        grafo.agregarArista(1, 3);
        grafo.agregarArista(2, 3);
        grafo.agregarArista(3, 4);
        // Imprimir el grafo
        grafo.imprimirGrafo();
        grafo.eliminarArista(1, 2);
        grafo.imprimirGrafo();
        
        
        GrafoMatriz g = new GrafoMatriz(5);

        // A=0, B=1, C=2, D=3, E=4
        g.setArista(DatoLista.A.ordinal(), DatoLista.E.ordinal(), 65);
        g.setArista(DatoLista.E.ordinal(), DatoLista.D.ordinal(), 30);
        g.setArista(DatoLista.D.ordinal(), DatoLista.E.ordinal(), 45);
        g.setArista(DatoLista.D.ordinal(), DatoLista.C.ordinal(), 25);
        g.setArista(DatoLista.C.ordinal(), DatoLista.E.ordinal(), 55);
        g.setArista(DatoLista.C.ordinal(), DatoLista.B.ordinal(), 40);
        g.setArista(DatoLista.B.ordinal(), DatoLista.A.ordinal(), 20);

        System.out.print(g.toString());
        ListaSimpleMatriz x = g.AristasMenoresQue(25);
        System.out.println("\nLista:\n"+x);
    }//final del main
}//final de la clase
