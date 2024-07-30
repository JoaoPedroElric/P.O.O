public class Lampada {
    boolean estadoDaLampada;
    Contador contador = new Contador(0);

    Lampada(boolean estadoDaLampada) {
        this.estadoDaLampada = estadoDaLampada;
    }

    void acesa() {
        estadoDaLampada = true;
        contador.contadorDeVezesLigada();    
    }

    void apaga() {
        estadoDaLampada = false;
    }

    void mostrarEstado() {
        if(estadoDaLampada == true) {
            System.out.println("LIGADA!");
        } else System.out.println("DESLIGADA!");
        System.out.println("VEZES LIGADA: " + contador.contador);
    }
}