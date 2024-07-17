
import java.util.Scanner;

public class NumeroPerfeito {
    public static void main(String[] args) {
        int numero;

        Scanner input = new Scanner(System.in);
        System.out.printf("DIGITE UN NÚMERO: ");
        numero = input.nextInt();

        int soma = 0, contador = 0;

        System.out.print("Numros perfeito de " + numero + "\n" + numero + " = ");
        
        while (contador < 4){
            for(int i = 1; i < numero; i++) {
                if(numero % i == 0) {
                    System.out.print(i); 
                    soma += i;
                    if (soma < numero) System.out.print(" + ");
                    contador++;
                } 
            }
        }

        input.close();
    }

}