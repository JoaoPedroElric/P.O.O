
import java.util.Scanner;

public class fatorialRecursivo {

    public static void main(String[] args) {
        int numero, resposta;

        Scanner input = new Scanner(System.in);
        System.out.printf("INFORME O NÚMERO PARA CALCULAR O FATORIAL: ");
        numero = input.nextInt();

        resposta = fatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + resposta);

        input.close();
    }

    public static int fatorial(int n) {
        if (n == 0){
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

}
