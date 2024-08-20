import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> compromissos;

    // Construtor
    public Agenda() {
        compromissos = new ArrayList<>();
    }

    public void addCompromisso(EntradaEmAgenda compromisso) {
        compromissos.add(compromisso);
    }

    public void listaDia(int dia, int mes, int ano) {
        for(EntradaEmAgenda compromisso : compromissos) {
            if(compromisso.ehNoDia(dia, mes, ano)){
                System.out.println(compromisso);
            }
        }
    }
}