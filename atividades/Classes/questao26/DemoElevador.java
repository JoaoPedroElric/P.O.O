
import java.util.Scanner;


public class DemoElevador{
    public static void main(String[] args) {
        Elevador predio = new Elevador(0, 5, 4, 0);
        int menu;

        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("(1) - [ENTRAR]");
            System.out.println("(2) - [SAIR]");
            System.out.println("(3) - [SUBIR]");
            System.out.println("(4) - [DESCER]");
            System.out.println("(5) - [FECHAR PROGRAMA]");

            menu = input.nextInt();

            switch(menu) {
                case 1:
                    predio.entrar();
                    break;
                case 2:
                    predio.sai();
                    break;
                case 3:
                    predio.sobe();
                    break;
                case 4:
                    predio.desce();
                    break;
            }

        }while(menu == 5);
    
    input.close();
    }
}