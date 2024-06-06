
import java.util.Scanner;

public class PlanoCartesiano {

    public static void main(String[] args) {
    
    int pontoX, pontoY, pontoX2, pontoY2;

    Scanner input = new Scanner(System.in);
    System.out.printf("Informe o valor do ponto x no plano cartesiano: ");
    pontoX = input.nextInt();

    System.out.printf("Informe o valor do ponto y no plano cartesiano: ");
    pontoY = input.nextInt();

    System.out.printf("Informe o valor do segundo ponto x no plano cartesiano: ");
    pontoX2 = input.nextInt();

    System.out.printf("Informe o valor do segundo ponto y no plano cartesiano: ");
    pontoY2 = input.nextInt();

    if(pontoX > pontoX2) {
        System.out.printf("O ponto (%d,%d) está a esquerda do ponto (%d,%d)\n", pontoX2, pontoY2, pontoX, pontoY);
    } else if(pontoX < pontoX2) {
        System.out.printf("O ponto (%d,%d) está a direita do ponto (%d,%d)\n", pontoX2, pontoY2, pontoX, pontoY);
    } else {
        System.out.printf("O ponto (%d,%d) está na mesma posição (x) do ponto (%d,%d)\n", pontoX2, pontoY2, pontoX, pontoY);
    }

    if(pontoY > pontoY2) {
        System.out.printf("O ponto (%d,%d) está abaixo do ponto (%d,%d)\n", pontoX2, pontoY2, pontoX, pontoY);
    } else if(pontoX < pontoX2) {
        System.out.printf("O ponto (%d,%d) está acima do ponto (%d,%d)\n", pontoX2, pontoY2, pontoX, pontoY);
    } else {
        System.out.printf("O ponto (%d,%d) está na mesma altura (y) do ponto (%d,%d)\n", pontoX2, pontoY2, pontoX, pontoY);
    }
    
    input.close();
    }
}