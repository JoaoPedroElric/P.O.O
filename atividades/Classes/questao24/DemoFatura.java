
public class DemoFatura {
    public static void main(String[] args) {
        Fatura fatura = new Fatura(1, "meia", 6, 2);
        // Fatura fatura2 = new Fatura(1, "meia", 6, -4);
        
        fatura.calcularTotal();
    }
}