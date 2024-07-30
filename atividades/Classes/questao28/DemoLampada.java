import java.util.Scanner;

public class DemoLampada {
    public static void main(String[] args) {
        int menu;
        Scanner input = new Scanner(System.in);
        Lampada lampada = new Lampada(false);

        do { 
            System.out.println("[1] LIGAR");
            System.out.println("[2] DESLIGAR");
            System.out.println("[3] EXIBIR ESTADO DA LAMPADA");
            System.out.println("[4] SAIR");
            menu = input.nextInt();

            switch(menu) {
                case 1:
                    lampada.acesa();
                    break;
                case 2:
                    lampada.apaga();
                    break;
                case 3:
                    lampada.mostrarEstado();
                    break;
            }
        } while (menu != 4);
    }
}