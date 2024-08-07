public class MediaArray {

    public static void main(String[] args) {
        System.out.println(media(1,2,3));
        System.out.println(media(1,6,3));
        System.out.println(media(5,5,5));
    }

    public static double media(double...numeros) {
        double soma = 0.0, media;

        for(double d: numeros) {
            soma += d;
        }
        media = soma/numeros.length;
        return media;
    }
}