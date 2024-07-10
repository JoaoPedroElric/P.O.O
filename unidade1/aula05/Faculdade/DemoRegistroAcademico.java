public class DemoRegistroAcademico {

    public static void main(String[] args) {
        double mensalidade;

        RegistroAcademico michael = new RegistroAcademico();
        michael.inicalizarRegistroAcademico("Michael", "123456", 3, 0.5);        
        mensalidade = michael.calculaMensalidade();
        System.out.println("Mensalidade 1: " + mensalidade);
        // michael.percentualDeCobranca = 0.75;
        mensalidade = michael.calculaMensalidade();
        System.out.println("Mensalidade 2: " + mensalidade);

        RegistroAcademico roberto = new RegistroAcademico();
        System.out.println("Mens. Roberto: " + roberto.calculaMensalidade());
    }
}