
import java.util.Scanner;

public class media {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double n1, n2, n3, resposta;

        System.out.printf("Informe a nota 1: ");
        n1 = input.nextDouble();

        System.out.printf("Informe a nota 1: ");
        n2 = input.nextDouble();
        
        System.out.printf("Informe a nota 1: ");
        n3 = input.nextDouble();

        resposta = media(n1, n2, n3);

        System.out.println("A media foi: " + resposta);
    }

    public static double media(double num1, double num2, double num3) {

        double soma = num1 + num2 + num3;
        double med = soma / 3;
        return med;
    }
}