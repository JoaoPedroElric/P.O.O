public class Matriz2x2 {
    private float[][] matriz;

    // Construtor para inicializar a matriz 2x2
    public Matriz2x2(float a11, float a12, float a21, float a22) {
        matriz = new float[2][2];
        matriz[0][0] = a11;
        matriz[0][1] = a12;
        matriz[1][0] = a21;
        matriz[1][1] = a22;
    }

    // Método para calcular o determinante da matriz
    public float calcularDeterminante() {
        return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
    }

    // Método para imprimir a matriz em formato matricial
    public void imprimirMatriz() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
