import java.util.Scanner;

public class AreaDoQuadrado{

    public static void main(String[] args) {
        
        double lado, area;
        
        System.out.printf("INFORME O TAMANHO DO LADO DO QUADRADO: ");
        Scanner imput = new Scanner(System.in);
        
        lado = imput.nextDouble();
        // area = lado * lado;

        // Ou.
        area = Math.pow(lado, 2);

        System.out.println("A AREA DO QUADRADO É: " + area);

        imput.close();
    }

}