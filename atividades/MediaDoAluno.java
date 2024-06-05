
import java.util.Scanner;

public class MediaDoAluno {

    public static void main(String[] args) {
        
        int indice;
        double nota, media = 0;

        Scanner imput = new Scanner(System.in);
        
        for(indice = 1; indice <=3; indice++){    
     
            System.out.printf("IMFORME A NOTA DO ALUNO NA UNIDADE %d ", indice);
            nota = imput.nextDouble();
            media += nota;

        }
        media = media / 3;
        System.out.println("A media do aluno é: " + media);

        imput.close();  
    }
}