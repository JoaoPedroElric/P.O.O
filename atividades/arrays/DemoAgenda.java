public class DemoAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.addCompromisso(new EntradaEmAgenda(10,5,10,2024, "não sei"));

        agenda.addCompromisso(new EntradaEmAgenda(5,22,05,2024, "aniversario"));

        agenda.addCompromisso(new EntradaEmAgenda(19,22,05,2024, "aula"));

        agenda.addCompromisso(new EntradaEmAgenda(9,22,05,2024, "prova"));

        agenda.addCompromisso(new EntradaEmAgenda(12,5,11,2024, "ferias"));

        agenda.listaDia(22, 5, 2024);
    }
}