package pkg155851933417_pp5;

/**
 *
 * @author j.alvarado.moreira
 */
public class GrafoMatriz {

    //TODO: Actualizar a clase Dato con atributos conexion (bool) y peso (int)
    private final NodoGrafoMatriz matrizAdyacencia[][];
    private final int numVertices;

    // Initialize the matrix
    public GrafoMatriz(int numVertices) {
        this.numVertices = numVertices;
        this.matrizAdyacencia = new NodoGrafoMatriz[numVertices][numVertices];

        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                matrizAdyacencia[i][j] = null;
            }
        }
    }

    // Add edges
    public void setArista(int i, int j, int peso) {
        matrizAdyacencia[i][j] = new NodoGrafoMatriz(peso);
    }

    // Remove edges
    public void eliminarArista(int i, int j) {
        matrizAdyacencia[i][j] = null;
    }

    public ListaSimpleMatriz AristasMenoresQue(int pPeso) {
        ListaSimpleMatriz aristasMenores = new ListaSimpleMatriz();
 
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (matrizAdyacencia[i][j] != null && matrizAdyacencia[i][j].getPeso() < pPeso) {
                    aristasMenores.insertar(new Objeto(matrizAdyacencia[i][j].getPeso(), i+""));
                }
            }
        }
 
        return aristasMenores;
    }
    
    // Print the matrix
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for (int i = 0; i < numVertices; i++) {
            s.append(DatoLista.values()[i]).append(" | ");
        }
        s.append("\n");
        for (int i = 0; i < numVertices; i++) {
            s.append(DatoLista.values()[i]).append(": ");
            for (int j = 0; j < numVertices; j++) {
                //TODO: Agregar el costo por cada conexión
                if (matrizAdyacencia[i][j] != null) {
                    s.append(matrizAdyacencia[i][j].toString()).append(" | ");
                } else {
                    s.append("_ | ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }

}
