public class Banco {
    private String nome;
    private double saldo;
    private boolean especial;

    public Banco (String nome, double saldo, boolean especial) {
        this.nome = nome;
        this.saldo = saldo;
        this.especial = especial;
    }

    public Banco (String nome) {
        this.nome = nome;
        this.saldo = 0.0;
        this.especial = false;
    }

    void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Saldo : " + saldo);
        System.out.println("Especial : " + (especial? "sim" : "não"));

    }
}