/* 
Aula 04/06/2024
 */

import java.util.Scanner;

public class data {

    public static void main(String[] args) {

        int dia;
        int mes;
        int ano;
        int qtdDias;

        Scanner input = new Scanner(System.in);
        String dataFormatada;

        System.out.printf("Digite o dia: ");
        dia = input.nextInt();

        System.out.printf("Digite o Mes: ");
        mes = input.nextInt();

        System.out.printf("Digite o ano: ");
        ano = input.nextInt();

        dataFormatada = dia + " de ";

        if(mes == 1){
            dataFormatada += "Janeiro";
        }else if (mes == 2) {
            dataFormatada += "Fevereiro";
        }else if (mes == 3) {
            dataFormatada += "Março";
        }else if (mes == 4) {
            dataFormatada += "Abril";
        }else if (mes == 5) {
            dataFormatada += "Maio";
        }else if (mes == 6) {
            dataFormatada += "Julho";
        }else if (mes == 7) {
            dataFormatada += "Junho";
        }else if (mes == 8) {
            dataFormatada += "Agosto";
        }else if (mes == 9) {
            dataFormatada += "Setembro";
        }else if (mes == 10) {
            dataFormatada += "Outubro";
        }else if (mes == 11) {
            dataFormatada += "Novenbro";
        }else if (mes == 12) {
            dataFormatada += "Dezembro";
        }

        dataFormatada += " de " + ano;

        System.out.println(dataFormatada);

        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                qtdDias = 31;
                break;
            case 2:
                qtdDias = 28;
                break;
            default:
                qtdDias = 30;
                break;
        }

        System.out.println("O mês da data informada tem " + qtdDias + " Dias.");

        input.close();
 
    }
 
}
    
