public class MegaSena {
    
      public static void main(String[] args) {
        int[] numeros = {49, 12, 58, 32, 04, 45}; 

        
        for (int i = 0; i < 6; i++) {
            System.out.print(numeros[i]);
            if(i < 5) {
                System.out.printf(" - ");
            }
        }
    }
}