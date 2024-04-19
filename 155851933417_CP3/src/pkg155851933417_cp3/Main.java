package pkg155851933417_cp3;

/**
 *
 * @author Jonathan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        
        arbol.inserta(new Dato("^", 50));
        arbol.inserta(new Dato("A", 80));
        arbol.inserta(new Dato("*", 20));
        arbol.inserta(new Dato("+", 30));
        arbol.inserta(new Dato("2", 31));
        arbol.inserta(new Dato("10", 29));
        arbol.inserta(new Dato("/", 10));
        arbol.inserta(new Dato("A", 15));
        arbol.inserta(new Dato("5", 5));
        arbol.inOrden();
        System.out.println("");
        System.out.println("\n Valor del arbol: "+arbol.evaluarArbol("1"));
        
        GrafoConLista grafo = new GrafoConLista();
        
        //creacion de vertices
        grafo.agregarVertice(new Objeto(1, "A"));
        grafo.agregarVertice(new Objeto(2, "B"));
        grafo.agregarVertice(new Objeto(3, "C"));
        grafo.agregarVertice(new Objeto(4, "D"));
        grafo.agregarVertice(new Objeto(5, "E"));
        
        //creacion de aristas
        grafo.agregarArista(1, 2);
        grafo.agregarArista(3, 4);
        
       grafo.imprimirGrafo();
        
        
    }//final del main
    
}//final de la clase
