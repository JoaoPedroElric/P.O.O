
import java.util.Scanner;

public class ConverterAngulos {

    public static void main(String[] args) {
        
        double angulo, radianos;
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o ângulo em graus: ");
        angulo = input.nextDouble();

        // cálculo para converter ângulo em radianos.
        radianos = angulo * (Math.PI / 180);
        // Usando a biblioteca Math para calcular as funções trigonometricas
        double seno = Math.sin(radianos);
        double cosseno = Math.cos(radianos);
        double tangente = Math.tan(radianos);
        double cossecante = 1 / seno;
        double secante = 1 / cosseno;
        double cotangente = 1 / tangente;

        System.out.println("RADIANOS: " + radianos);
        System.out.println("SENO: " + seno);
        System.out.println("COSSENO: " + cosseno);
        System.out.println("TANGENTE: " + tangente);
        System.out.println("COSSECANTE: " + cossecante);
        System.out.println("SECANTE: " + secante);
        System.out.println("COTANGENTE: " + cotangente);

        input.close();

    }

}