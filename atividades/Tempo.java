
import java.util.Scanner;

public class Tempo {

    public static void main(String[] args) {
        
        int tempo, dias = 0, horas = 0, minutos = 0;
        Scanner imput = new Scanner(System.in);
        
        System.out.printf("Digite a quantidade de minutos a ser convertida em dias: ");
        tempo = imput.nextInt();
       
        dias = tempo / 1440; // Dividimos o tempo em minutos pela quantidade de minutos no dia.
        horas = (tempo % 1440) / 60; // Pegamos o resto da divisão de do dia e dividimos por 60 para obter as horas.
        minutos = (tempo % 1440) % 60; // Dividimos o resto dos minutos do dia pelo resto da divisão de 60 para obter os minutos que falta para obter uma hora.
       
        System.out.println("DIA: " + dias + " HORAS: " + horas + " MINUTOS: " + minutos);

    }

}