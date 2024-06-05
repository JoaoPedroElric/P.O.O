
import java.util.Calendar;
import java.util.Scanner;

public class ValidarCartao {

    public static void main(String[] args) {
        String nome, numero, codigo;
        int mes, ano, anoAtual, mesAtual;
        boolean expirado;

        Calendar calendar = Calendar.getInstance();

        anoAtual = calendar.get(calendar.YEAR);
        mesAtual = calendar.get(calendar.MONTH);
        Scanner imput = new Scanner(System.in);

        do{
            System.out.printf("Digite seu nome: ");
            nome = imput.nextLine();

            
            System.out.printf("Digite o número do cartão: ");
            numero = imput.nextLine();

            System.out.printf("Digite seu codigo: ");
            codigo = imput.nextLine();

            System.out.printf("Digite o mês: ");
            mes = imput.nextInt();

            System.out.printf("Digite o ano: ");
            ano = imput.nextInt();

            expirado = (ano < anoAtual) || (ano == anoAtual) && (mes < mesAtual);

            System.out.printf("%d/%d\n", mesAtual, anoAtual);

        }while(expirado);

        System.out.printf("Cartão valido!!");

        imput.close();
    }

}