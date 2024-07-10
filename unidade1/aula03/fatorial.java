
import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        int numero, fat;
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite um número para calcular o fatorial: ");
        numero = input.nextInt();

        for(int num = 0; num <= numero; num++){
            fat = 1;
            for(int i = num; i > 0; i--){
                fat *= i;
                    
            }
            System.out.println("Fatorial de " + num + " = " + fat);
        }
        
    }

}