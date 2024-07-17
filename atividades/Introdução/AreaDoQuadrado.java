import java.util.Scanner;

public class AreaDoQuadrado{

    public static void main(String[] args) {
        
        double lado, area;
        
        System.out.printf("INFORME O TAMANHO DO LADO DO QUADRADO: ");
        Scanner input = new Scanner(System.in);
        
        lado = input.nextDouble();
        // area = lado * lado;

        // Ou.
        area = Math.pow(lado, 2);

        System.out.println("A AREA DO QUADRADO É: " + area);

        input.close();
    }

}