import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.printf("Digite um número: ");
        numero = input.nextInt();

        if(numero == 0) {
            System.out.println("!!Insira um numero positivo maior que zero!!\n");
        } else {
            
            int primeiroTermo = 0, segundoTermo = 1, proximoTermo;
            
            for(int i = 1; i <= numero; i++){

                System.out.print(primeiroTermo + " ");
                proximoTermo = primeiroTermo + segundoTermo;
                primeiroTermo = segundoTermo;
                segundoTermo = proximoTermo;
            }
        }
        // calculo basico para achar o termo, (n-1) + (n-2)
        /* 
        numero = (numero - 1) + (numero -2);
        System.out.println(numero);
         */

        input.close();
    }
}