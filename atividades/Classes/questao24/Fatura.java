class Fatura {
    int numeroDeIdentificacao;
    String descricao;
    int quantidade;
    double preco;

    Fatura (int numeroDeIdentificacao, String descricao, int quantidade, int preco) {
        this.numeroDeIdentificacao = numeroDeIdentificacao;
        this.descricao = descricao;
        if(quantidade < 0) quantidade = 0;
        this.quantidade = quantidade;
        if(preco < 0) preco = 0;
        this.preco = preco;
    }

    void calcularTotal() {
        System.out.print("TOTAL: " + quantidade * preco);
    }

}