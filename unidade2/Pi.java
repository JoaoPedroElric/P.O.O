public class Pi{
    public static void main(String[] args) {
        double[] termosDaSerie = new double[1000000];
        // Inicializando a array.
        for(int i = 0; i < termosDaSerie.length; i++){
            termosDaSerie[i] = 1/Math.pow(i + 1 ,2);
        }       

        for(int num = 10; num <= 100000; num += 10) {
            calculaEMostraSomatorio(termosDaSerie, num);
        }
    }

    public static void calculaEMostraSomatorio(double[] vetor, int num) {
        double soma = 0.0;
        
        for(int i = 0; i < num; i++) {
            soma += vetor[i];
        }

        System.out.println("Soma com " + num + " é igual a: " + soma);

    }
}