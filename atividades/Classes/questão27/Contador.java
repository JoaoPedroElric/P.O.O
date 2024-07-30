public class Contador {
    private int contador;

    Contador(int contador) {
        this.contador = contador;
    }

    void zerar() {
        this.contador = 0;
    }

    void incrementar() {
        contador ++;
    }

    void imprimir() {
        System.out.println(contador);
    }
}