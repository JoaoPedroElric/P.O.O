public class velocidade {
    public static void main(String[] args) {
        double kph, mps, mph, pps;
        
        kph = 0.0;

        System.out.println("| kph | mps | mph | pps |");
        while (kph <= 50.0){

            pps = 0.9113 * kph;
            mph = 0.6214 * kph;
            mps = 0.2778 * kph;

            System.out.printf("| %.2f | %.2f | %.2f | %.2f |\n",kph, mps, mph, pps);
            kph += 0.5;
        }

    }
}