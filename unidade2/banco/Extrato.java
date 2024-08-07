
import java.util.ArrayList;

public class Extrato {
    private double saldoFinal;
    private ArrayList<Double> transacoes;

    public Extrato() {
        saldoFinal = 0.0;
        transacoes = new ArrayList<Double>();
    }

    public void transacao(double valor) {
        if(saldoFinal + valor >= 0){
            saldoFinal += valor;
            transacoes.add(valor); // Historico do extrato.
            System.out.println("TRANSAÇÃO REALIZADA");
        }else System.out.println("VALOR INDSIPONIVEL!");
    }

    public void imprimir() {
        System.out.println("=====================");
        for(Double d: transacoes){
            System.out.println(d);
        }
        // for(int i = 0; i < transacoes.size(); i++){
        //     System.out.println( i + ": " + saldoFinal);

        // }
        System.out.println("SALDO: " + saldoFinal);
        System.out.println("=====================");
    }

}