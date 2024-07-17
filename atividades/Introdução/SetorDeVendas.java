 
import java.util.Scanner;

public class SetorDeVendas {

    public static void main(String[] args) {
        int setor;
        double precoOriginal, precoComDesconto;

        Scanner input = new Scanner(System.in);

        do{    
            System.out.printf("Digite 0 para sair\nInforme o setor>> ");
            setor = input.nextInt();

            /* 
            Para calcular a porcentagem de maneira mais pratica podemos usar o calor original multiplicado por 0.1
            para representar 90%, 0.2 pra 80% 0.3 pra 70%... e assim por diante.
             */

            switch (setor) {
                case 111:
                    System.out.println("SETOR DE CAMA, MESA E BANHO");

                    System.out.printf("INFORME O PREÇO DO PRODUTO>> ");
                    precoOriginal = input.nextDouble();

                    if(precoOriginal > 100){
                        precoComDesconto = precoOriginal * 0.6; // 40%.
                    } else if(precoOriginal >= 50){
                        precoComDesconto = precoOriginal * 0.8; // 20%.
                    } else {
                        precoComDesconto = precoOriginal * 0.9; // 10%.
                    }

                    System.out.println("Setor: CAMA, MESA E BANHO\nVALOR: " + precoOriginal + "\nVALOR COM DESCONTO: " + precoComDesconto);

                    break;

                case 222:
                    System.out.println("SETOR DE ELETROS");

                    System.out.printf("INFORME O PREÇO DO PRODUTO>> ");
                    precoOriginal = input.nextDouble();

                    if(precoOriginal >= 500) {
                        precoComDesconto = precoOriginal * 0.9; // 10%.
                    } else {
                        precoComDesconto = precoOriginal;
                    }
                
                    System.out.println("Setor: ELETROS \n VALOR: " + precoOriginal + "\nVALOR COM DESCONTO: " + precoComDesconto);

                    break;
                case 0:
                    System.exit(0);

                default:
                    System.out.println("!!SETOR INVALIDO!!");
            } 

        }while(setor != 111 || setor != 222);

        input.close();
    }

}