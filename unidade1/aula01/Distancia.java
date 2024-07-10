
import java.util.Scanner;

public class Distancia{

    public static void main(String[] args) {

        double x1, y1, x2, y2, dist;
        Scanner input = new Scanner(System.in);

        System.out.print("x1: ");
        x1 = input.nextDouble();

        System.out.print("x2: ");
        x2 = input.nextDouble();

        System.out.print("y1: ");
        y1 = input.nextDouble(); 

        System.out.print("y2: ");
        y2 = input.nextDouble();

        dist = Math.sqrt(Math.pow(x2-x1, 2.0) + Math.pow(y2-y1, 2.0));

        System.out.printf("Distancia: %g", dist);

        input.close();

    }

}