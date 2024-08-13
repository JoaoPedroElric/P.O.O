public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico aluno1 = new RegistroAcademico("pedro", 1, "POO");
        RegistroAcademicoPosGraduacao pos = new RegistroAcademicoPosGraduacao("lucas", 3, "POO", "jogos", "italo");
        System.out.println(pos);
        System.out.println(aluno1);
    }
}