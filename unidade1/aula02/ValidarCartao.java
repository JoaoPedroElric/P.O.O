
import java.util.Calendar;
import java.util.Scanner;

public class ValidarCartao {

    public static void main(String[] args) {
        String nome, numero, codigo;
        int mes, ano, anoAtual, mesAtual;
        boolean expirado;

        Calendar calendar = Calendar.getInstance(); // A função calendar vai pegar a data atual do computador.

        // ---------- Obtendo a data atual ----------
        anoAtual = calendar.get(calendar.YEAR);
        mesAtual = 1 + calendar.get(calendar.MONTH); // Mes começa em 0 para ser usado em um vetor.
        Scanner input = new Scanner(System.in);

        
        
        System.out.printf("Digite seu nome: ");
        nome = input.nextLine();

            
        System.out.printf("Digite o número do cartão: ");
        numero = input.nextLine();

        System.out.printf("Digite seu codigo: ");
        codigo = input.nextLine();

        do {
            System.out.printf("Digite o mês: ");
            mes = input.nextInt();

            System.out.printf("Digite o ano: ");
            ano = input.nextInt();

            // Checa se a data esta na validade.
            expirado = (ano < anoAtual) || (ano == anoAtual) && (mes < mesAtual);
            if (expirado){
                System.out.println("!!A data está expirada, ou errada!!");
            }

            System.out.printf("%d/%d\n", mesAtual, anoAtual);

        }while(expirado);

        System.out.printf("Cartão valido!!");

        input.close();
    }

}