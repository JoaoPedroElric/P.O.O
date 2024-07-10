public class DemoTriangulo {
    
    public static void main(String[] args) {
        Triangulo t1, t2, t3;

        t1 = new Triangulo();
        t1.inicializar(3, 4, 5, "triangulo");

        t2 = new Triangulo();
        t2.inicializar(3, 4, 5, "triangulo");

        t3 = new Triangulo();

        t3 = t1;
    
        System.out.println(t1 == t2);
        System.out.println(t1 == t3);
    }
}