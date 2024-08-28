
import java.util.TreeMap;

public class ContarPalavras {
    public static void main(String[] args) {
        String entrada = "simplesmente uma simulação de texto da indústria tipográfica e de impressos e vem sendo utilizado desde o século XVI quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos Lorem Ipsum sobreviveu não só a cinco séculos como também ao salto para a editoração eletrônica permanecendo essencialmente inalterado Se popularizou na década de 60 quando a Letraset lançou decalques contendo passagens de Lorem Ipsum e mais recentemente quando passou a ser integrado a softwares de editoração eletrônica como Aldus PageMaker";

        TreeMap<String, Integer> contador = new TreeMap<>();
        String[] palavras = entrada.split(" ");

        for(String palavra : palavras) {
            String palavraMinuscula = palavra.toLowerCase();
            if(contador.containsKey(palavraMinuscula)){
                int valor = contador.get(palavraMinuscula);
                contador.put(palavraMinuscula, valor);
            }else {
                contador.put(palavraMinuscula, 1);
            }
        }

        System.out.println(contador);

        // for(String palavra : contador.keySet()) {
        //     System.out.println(contador);
        // }
    }
}