class RegistroAcademico {
    String nome;
    String matricula;
    int codigoDoCurso;
    double percentualDeCobranca;

    void inicalizarRegistroAcademico( String n, String m, int c, double p) {
        nome = n;
        matricula = m;
        codigoDoCurso = c;
        percentualDeCobranca = p;
    }

    double calculaMensalidade() {
        return 100 * codigoDoCurso * percentualDeCobranca;
    }
}