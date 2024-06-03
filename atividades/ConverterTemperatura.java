
import java.util.Scanner;

public class ConverterTemperatura {

    public static void main(String[] args) {

        double celsius, fahrenheit;
        
        Scanner imput = new Scanner(System.in);

        System.out.printf("Digite a temperatura em celsius: ");
        celsius = imput.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(fahrenheit + "° Fahrenheit");

    }

}