
import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        
        int maior = 0, numero, indice = 0;
        Scanner input = new Scanner(System.in);

        while(indice < 3){
            System.out.printf("DIGITE UM NÚMERO: ");
            numero = input.nextInt();

            if(numero > maior){
                maior = numero;
            }

            indice ++;
        }

        System.out.println("O maior número foi " + maior);
        input.close();
    }

}