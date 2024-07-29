class TimeDeEsporte {
    String nomeDoTime;
    String estadio;
    String nomeDoTecnico;

    TimeDeEsporte(String nomeDoTime, String estadio, String nomeDoTecnico) {
        this.nomeDoTime = nomeDoTime;
        this.estadio = estadio;
        this.nomeDoTecnico = nomeDoTecnico; 
    }

    void mostrarTime() {
        System.out.println("Nome Do time: " + nomeDoTime);
        System.out.println("Nome Do Estadio: " + estadio);
        System.out.println("Nome Do Tecnico: " + nomeDoTecnico);
    }
}