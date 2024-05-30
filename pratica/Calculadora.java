
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        int opcao = 0;
        double x, y, resultado;

        while (opcao != 5){
            // ----------------MENU-----------------
            System.out.println("CALCULADORA BASICA\n[1] ADIÇÃO\n[2] SUBTRAÇÃO\n[3] MULTIPLICAÇÃO\n[4] DIVISÃO\n[5] SAIR");

            Scanner imput = new Scanner(System.in);
            opcao = imput.nextInt();

            // ADIÇÃO.
            if (opcao == 1) {

                System.out.println("Valor de x: ");
                x = imput.nextDouble();
                
                System.out.println("Valor de y: ");
                y = imput.nextDouble();

                resultado = x + y;
                System.out.println(resultado);

            }
            // SUBTRAÇÃO.
            if (opcao == 2) {

                System.out.println("Valor de x: ");
                x = imput.nextDouble();
                
                System.out.println("Valor de y: ");
                y = imput.nextDouble();

                resultado = x - y;
                System.out.println(resultado);

            }
            // MULTIPLICAÇÃO.
            if (opcao == 3) {

                System.out.println("Valor de x: ");
                x = imput.nextDouble();
                
                System.out.println("Valor de y: ");
                y = imput.nextDouble();

                resultado = x * y;
                System.out.println(resultado);

            }
            // DIVISÃO.
            if (opcao == 4) {
              
                System.out.println("Valor de x: ");
                x = imput.nextDouble();
                
                do{ // Laço de repetição para checar se o denominador é zero (0).
                    System.out.println("Valor de y: ");
                    y = imput.nextDouble();
                    
                if(y == 0){
                    System.out.println("!!O VALOR DE Y NÃO PODE SER ZERO (0)!!");
                }
                
                }while (y == 0);

                resultado = x / y;
                System.out.println(resultado);

            }
        }
    }
    
}