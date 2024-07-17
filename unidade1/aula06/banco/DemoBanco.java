public class DemoBanco {
    public static void main(String[] args) {
        Banco contaPedro = new Banco("Pedro",1200.56,true);

        Banco contaJoao = new Banco("Joao");

        contaPedro.imprimirDados();
        contaJoao.imprimirDados();
    }
}