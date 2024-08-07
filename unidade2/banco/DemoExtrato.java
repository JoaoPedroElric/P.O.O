
import java.util.Scanner;

public class DemoExtrato {
    public static void main(String[] args) {
        int opc;
        double valor;
        Scanner input = new Scanner(System.in);
        Extrato extrato = new Extrato();
        do {
            
            System.out.println("[1] DEPOSITO");
            System.out.println("[2] SACAR");
            System.out.println("[3] VISUALIZAR");
            System.out.println("[4] ENCERRAR");
            System.out.println(">> ");
            opc = input.nextInt();

        
            switch (opc) {
                case 1:
                    System.out.println("VALOR DO DEPOSITO: ");
                    valor = input.nextDouble();
                    extrato.transacao(valor);
                    break;
                case 2:
                    System.out.println("VALOR DO SAQUE: ");
                    valor = input.nextDouble();
                    extrato.transacao(-valor);
                    break;
                case 3:
                    extrato.imprimir();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("!!VALOR INVALIDO!!");
            }
            
        }while(opc != 4);
    }
}