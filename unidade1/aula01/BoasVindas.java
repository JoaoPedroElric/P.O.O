
import java.util.Scanner;


public class BoasVindas{

    public static void main(String[] args) { 

        String nome;
        Scanner input = new Scanner(System.in);

        System.out.print("DIGITE SEU NOME>> ");
        nome = input.nextLine(); // Serve para pegar toda a frase ate a tecla enter se apertada.

        System.out.print("BEM VINDO " + nome);

        input.close(); // Quando não for mais usar o imput.
    }


}