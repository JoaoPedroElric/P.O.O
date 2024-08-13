public class RegistroAcademico {
    String nomeDoAluno;
    int matricula;
    String curso;

    public RegistroAcademico(String nomeDoAluno, int matricula, String curso){
        this.nomeDoAluno = nomeDoAluno;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String toString() {
        return "NOME: " + nomeDoAluno + " MATRICULA: " + matricula + " CURSO: " + curso;
    }

}