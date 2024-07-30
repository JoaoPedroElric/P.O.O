public class NumeroComplexo {
    double real;
    String imaginario;

    NumeroComplexo(double real, String imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    NumeroComplexo(double real) {
        this.real = real;
        this.imaginario = "0";
    }

    NumeroComplexo() {
        this.real = 0;
        this.imaginario = "0";
    }

    String ToString() {
        return ( real + " + " + imaginario);
    }
}