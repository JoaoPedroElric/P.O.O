
import java.util.Scanner;

public class Cartas {
    
    public static void main(String[] args) {
        
        int carta, naipe;
        String nomeCarta = "";
        String naipeCarta = "";

        Scanner imput = new Scanner(System.in);
        System.out.printf("DIgite um numero de 1 a 13: ");
        carta = imput.nextInt();

        System.out.printf("Digite outro número de 1 a 4: ");
        naipe = imput.nextInt();

        switch(carta) {
            case 1:
                nomeCarta = "ÁS";
                break;
            case 11:
                nomeCarta = "VALETE";
                break;
            case 12:
                nomeCarta = "DAMA";
                break;
            case 13:
                nomeCarta = "REI";
                break;
            default:
                nomeCarta = Integer.toString(carta);
        }

        switch (naipe) {
            case 1:
                naipeCarta = "OUROS";               
                break;
            case 2:
                naipeCarta = "PAUS";
                break;
            case 3:
                naipeCarta = "COPAS";               
                break;
            case 4:
                naipeCarta = "ESPADA";
                break;
            default:
                System.out.println("!!ESSA CARTA NÃO EXISTE!!");
        }

    System.out.println(nomeCarta + " DE " + naipeCarta);

    imput.close();

    }


}