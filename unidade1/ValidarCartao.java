
import java.util.Scanner;

public class ValidarCartao {

    public static void main(String[] args) {
        String nome, numero, codigo;
        int mes, ano;


        Scanner imput = new Scanner(System.in);
        System.out.printf("Digite seu nome: ");
        nome = imput.nextLine();

        System.out.printf("Digite o número do cartão: ");
        numero = imput.nextLine();

        System.out.printf("Digite seu nome: ");
        codigo = imput.nextLine();

        System.out.printf("Digite o mês: ");
        mes = imput.nextInt();

        System.out.printf("Digite o ano: ");
        ano = imput.nextInt();

        imput.close();
    }

}