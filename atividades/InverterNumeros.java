import java.util.Scanner;

public class InverterNumeros {

    public static void main(String[] args) {
        
        int numeroOriginal, numeroInvertido = 0;

        Scanner input = new Scanner(System.in);
        System.out.printf("Digite um nemero inteiro para ser invertido: ");
        numeroOriginal = input.nextInt();

        
        while (numeroOriginal > 0){

            numeroInvertido = numeroInvertido * 10 + numeroOriginal % 10;
            numeroOriginal /= 10; 
        }

        System.out.println("Número invertido: " + numeroInvertido);
        input.close();

    }

}