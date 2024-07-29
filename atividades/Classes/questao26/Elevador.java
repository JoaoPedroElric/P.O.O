class Elevador {
    int andarAtual;
    int totalAndares;
    int capacidadeElevador;
    int quantidadeNoElevador;

Elevador(int andarAtual, int totalAndares, int capacidadeElevador, int quantidadeNoElevador) {
    this.andarAtual = andarAtual;
    this.totalAndares = totalAndares;
    this.capacidadeElevador = capacidadeElevador;
    this.quantidadeNoElevador = quantidadeNoElevador;
}

int entrar() {
    if(quantidadeNoElevador > capacidadeElevador){
        System.out.println("Capacidade cheia!");
    } else quantidadeNoElevador += 1;
    // System.out.println("TOTAL DE PESSOAS NO ELEVADOR: " + quantidadeNoElevador);
    System.out.println("ANDAR ATUAL : " + andarAtual);

    return quantidadeNoElevador;
}

int sai() {
    if(quantidadeNoElevador == 0){
        System.out.println("Não a ninguem no elevador");
    } else quantidadeNoElevador -= 1;
    // System.out.println("TOTAL DE PESSOAS NO ELEVADOR: " + quantidadeNoElevador);
    System.out.println("ANDAR ATUAL : " + andarAtual);

    return quantidadeNoElevador;
}

int sobe() {
    if(andarAtual == totalAndares){
        System.out.println("Estamos no topo!");
    } else andarAtual += 1;
    System.out.println("TOTAL DE PESSOAS NO ELEVADOR: " + quantidadeNoElevador);
    // System.out.println("ANDAR ATUAL : " + andarAtual);

    return andarAtual;
}

int desce() {
    if(andarAtual == 0){
        System.out.println("Estamos no terrio!");
    }else andarAtual -= 1;
    System.out.println("TOTAL DE PESSOAS NO ELEVADOR: " + quantidadeNoElevador);
    // System.out.println("ANDAR ATUAL : " + andarAtual);

    return andarAtual;
}
}