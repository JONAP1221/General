package pkg155851933417_pp5;

public class NodoGrafoMatriz {

    private int peso;

    public NodoGrafoMatriz(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return this.peso;
    }
    
    @Override
    public String toString() {
        return Integer.toString(peso);
    }
}
