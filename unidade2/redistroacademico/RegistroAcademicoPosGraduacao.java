public class RegistroAcademicoPosGraduacao {
    private RegistroAcademico gradInfo;
    private String tituloTese;
    private String orientador;

    public RegistroAcademicoPosGraduacao(RegistroAcademico gradInfo, String tituloTese, String orientador) {
        this.gradInfo = gradInfo;
        this.tituloTese = tituloTese;
        this.orientador = orientador;
    }

    public RegistroAcademicoPosGraduacao(String nomeDoAluno, int matricula, String curso, String tituloTese, String orientador) {
        this.gradInfo = new RegistroAcademico(nomeDoAluno, matricula, curso); 
        this.tituloTese = tituloTese;
        this.orientador = orientador;
    }

    public String toString() {
        return  gradInfo + " TESE: " + tituloTese + " ORIENTADO: " + orientador;
    }

}