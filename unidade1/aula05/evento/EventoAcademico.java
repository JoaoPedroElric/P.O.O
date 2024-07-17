class EventoAcademico {
    String nomeEvento;
    String localEvento;
    int numeroDeConvidados;
    
    //this pode ser usado para sabermos qual a variavel ou metodo é da prorpia classe.
    EventoAcademico(String nome, String local, int convidados){
        nomeEvento = nome;
        localEvento = local;
        numeroDeConvidados = convidados;
    }

    void mostrarEventos() {
        System.out.println("Nome: " + nomeEvento);
        System.out.println("Local: " + localEvento);
        System.out.println("Convidados: " + numeroDeConvidados);
    }
}