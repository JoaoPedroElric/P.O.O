public class DemoMatriz2x2 {
    public static void main(String[] args) {
        // Criando uma instância da matriz 2x2
        Matriz2x2 matriz = new Matriz2x2(1.0f, 2.0f, 3.0f, 4.0f);

        // Imprimindo a matriz
        System.out.println("Matriz:");
        matriz.imprimirMatriz();

        // Calculando e imprimindo o determinante
        float determinante = matriz.calcularDeterminante();
        System.out.println("Determinante: " + determinante);
    }
}
