public class DemoContador {
    public static void main(String[] args) {
     Contador eventos = new Contador(10);

     eventos.imprimir();   
     eventos.zerar();   
     eventos.incrementar();   
     eventos.imprimir();   
     eventos.zerar();   
     eventos.imprimir();   
    }
}