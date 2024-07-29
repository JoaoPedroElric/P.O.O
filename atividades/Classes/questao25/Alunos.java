
import java.util.Scanner;

class Alunos {
    String matricula;
    String nome;
    double p1, p2, t;

    Alunos(String matricula, String nome, double p1, double p2, double t) {
        this.matricula = matricula;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.t = t;
    }

    double media() {
        return ((2.5 * p1) + (2.5 * p2) + (2 * t)) / 7;
    }

    double provaFinal() {
        double mp = media();
        double ef;
        double mf;

        Scanner input = new Scanner(System.in);

        if(mp < 3 || mp >= 7) return 0;

        System.out.println("infroma a nota da prova final: ");
        ef = input.nextDouble();

        mf = ((mp * 6) + (ef * 4)) / 10;

        if(mf >= 5) {
            System.out.println("Aluno Aprovado com media " + mf);
        } else System.out.println("aluno reprovado por media " + mf);

        input.close();

        return mf;
    }
}

