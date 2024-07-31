public class NumeroComplexo {
    double real;
    double imaginario;

    NumeroComplexo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    NumeroComplexo(double real) {
        this(real, 0.0);   
    }

    NumeroComplexo() {
        this(0.0, 0.0);
    }

    String ToString() {
        return ( real + " + " + imaginario);
    }
}