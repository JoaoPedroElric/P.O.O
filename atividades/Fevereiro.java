
import java.util.Scanner;

public class Fevereiro {
    
    public static void main(String[] args) {
        
        int dia, semana;

        Scanner imput = new Scanner(System.in);

        System.out.printf("Digite um dia do mes de fevereio: ");
        dia = imput.nextInt();
        semana = (dia - 1) % 7;
        
        switch (semana) {
            case 0:
                System.out.println("O dia " + dia + " é Domingo");
                break;
            case 1:
                System.out.println("O dia " + dia + " é Segunda");
                break;
            case 2:
                System.out.println("O dia " + dia + " é Terça");
                break;
            case 3:
                System.out.println("O dia " + dia + " é Quarta");
                break;
            case 4:
                System.out.println("O dia " + dia + " é Quinta");
                break;
            case 5:
                System.out.println("O dia " + dia + " é Sexta");
                break;
            case 6:
                System.out.println("O dia " + dia + " é Sabado");
                break;
            default:
                
        }    

    }
}