class EventoAcademico {
    String nomeEvento;
    String localEvento;
    int numeroDeConvidados;

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